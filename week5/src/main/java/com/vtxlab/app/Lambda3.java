package com.vtxlab.app;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Lambda3 {

  public static void main(String[] args) {

    // one value, one output
    // no return keyword because only have one sentence
    Function<Integer, String> function = (i) -> "abc";
    Function<Integer, int[]> f2 = (a) -> new int[] { 1, 2, 3 };
    // HashMap auto string, string
    Function<Integer, Map<String, String>> f3 = (b) -> new HashMap<>();

    Function<Integer, int[]> f4 = (a) -> {
      if (a == 4) {
        return new int[] { 1, 2, 3 };
      }
      return new int[] { 3, 2, 1 };
    };

    // implement the logic for the method apply
    // e.g a = 5, return size 5 of the array
    Function<Integer, int[]> arrayWithSize = (a) -> new int[a];

    int[] integers = arrayWithSize.apply(5);
    BiFunction<Integer, Integer, Double[]> arrayWithSize2 = (a, b) -> new Double[a + b];
    Double[] arr = arrayWithSize2.apply(4, 5);

    Function<Integer, Integer> randomNumber = (range) -> (int) (Math.random() * 10);
    System.out.println(randomNumber.apply(1));

    Function<Long, LocalDate> nextWeek = (days) -> LocalDate.now().plusDays(days);
    System.out.println(nextWeek.apply(7l));

    /*
     * A supplier is used when you want to generate or supply values
     * without taking any input, usually constant
     */
    // () -> LocalDate.now().plusDays(7l);
    // () is input prerameter, LocalDate.now().plusDays(7l) return
    Supplier<LocalDate> SevenDaysLater = () -> LocalDate.now().plusDays(7l);
    System.out.println(SevenDaysLater.get());

    Consumer<Object> number = x -> {
      if (x instanceof Number) { // check if x is a child class of Number
        System.out.println(x.toString()); // print value of x
        return;
        // System.out.println(((Number) x).intValue());
      }
      System.out.println("*");
    };
    number.accept("abc"); // accept is for input the value to number
    number.accept(5);
    number.accept(new int[] { 1, 2, 3 });
    number.accept(10f);

    // UnaryOperator and BinaryOperator
    // the input and value are the same

    // if and only if the implementation can be completed in one line
    // skip bracket and return keyword
    // UnaryOperatior is normal to use for remodifying the type
    UnaryOperator<String> toLowerCase = x -> x.toLowerCase();
    UnaryOperator<String> replaceCbyA = x -> x.replace("c", "a");

    // implement the method into an object
    //
    String s = toLowerCase.apply("CCC"); // CCC -> ccc
    String s2 = replaceCbyA.apply(s); // ccc -> aaa
    System.out.println(s2);

    // chain method
    String s3 = toLowerCase.andThen(replaceCbyA).apply("CCC"); // CCC -> ccc -> aaa
    System.out.println(s3);

    BinaryOperator<int[]> mergeInarray = (x, y) -> {

      int[] z = new int[x.length + y.length];
      for (int i = 0; i < x.length; i++) {
        z[i] = x[i];
      }
      for (int j = 0; j < y.length; j++) {
        z[x.length + j] = y[j];
      }
      return z;
    };

    // int array
    int[] newArray = mergeInarray.apply(new int[] { 3, 2, 1, 0 }, new int[] { 10, 40, 20 });
    Arrays.sort(newArray);

    // count how many 0 of newarray currently has

    // creating new array to remove 0
    int[] o = new int[newArray.length]; // default 0 -> 0,0,0,0,0,0,0
    for (int k = 0; k < o.length; k++) {
      if (newArray[k] != 0) {
        o[k] = newArray[k];
      }
    }

    System.out.println(Arrays.toString(newArray));

    //
    char[] cArray = "String1".toCharArray();
    char[] cArray2 = "String2".toCharArray();

    // Predicate

    Predicate<String> lengthSmallerThan5 = x -> x.length() < 5;
    BiPredicate<String, String> compareStringHash = (x, y) -> x.hashCode() == y.hashCode();
    System.out.println(compareStringHash.test("abc", "abc")); // true
    System.out.println(compareStringHash.test("abc", "abcd")); // false
    // Predicate<String> f = x -> x.<5;

    String s10 = "abcd";
    System.out.println(s10.hashCode());

    s10 = s10.replace("a", "*"); // replace a as *
    String s11 = s10.substring(1, 4);
    System.out.println(s10);
    System.out.println(s11);
    System.out.println(s10.isEmpty());
    String s12 = s10.replace("a", " ");
    System.out.println(s12.isBlank());

  }
}