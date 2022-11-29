package com.vtxlab.app;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Lambda2 {

  public static void main(String[] args) {
    // 1. Map<String, Integer> nameLengthMap = new HashMap<>();
    // nameLengthMap.put("Peters", 1000);
    Map<Integer, Integer> nameLengthMap = new HashMap<>();

    // Function<String, Integer> - <left (input), right (output)
    // To calculate the length of input "String"
    // 2. Function<String, Integer> computeLength = String::length;
    Function<Integer, Integer> computeLength = s -> 0;

    // ("Peters", computeLength) same as nameLengthMap.put("Peters", 1000);
    // 3. Integer computedValue = nameLengthMap.computeIfAbsent("Peters",
    // computeLength);

    Integer computedValue = nameLengthMap.computeIfAbsent(12, computeLength);

    // System.out.println(computedValue);
    // System.out.println(nameLengthMap.get(12));

    // Bifunction
    Map<String, Integer> nameFrequencyMap = new HashMap<>();
    nameFrequencyMap.put("Peter", 3);

    BiFunction<Integer, Integer, Integer> mergeFrequencyNyName = (a, b) -> a + b;

    // 1. "Peter" is a key to find the value in the map.entry
    // 2. Then compute the return value and second parameter according to my formula
    // 3. 3 + 4 =7
    // 4. Finally update the value to 7 for key "Peter"

    Integer mergeValue = nameFrequencyMap.merge("Peter", 4, mergeFrequencyNyName);
    System.out.println(mergeValue); // 7
    System.out.println(nameFrequencyMap); // 7

    List<String> names = Arrays.asList("Peter", "Paul", "Mary");

    List<Integer> integers = Arrays.asList(1, 5);

    // lambda passed in as *Consumers*
    Consumer<String> printName = name -> System.out.println("Hello" + name);
    Consumer<Integer> printInteger = integer -> System.out.println("Hello" + integer);

    // no return, only implement actions
    names.forEach(name -> {
      System.out.println("Hello" + name);
      System.out.println("Hello2" + name);
    });

    List<Integer> numbers = Arrays.asList(5, 4, 2, 1, 3);

    // numbers.forEach(numbers -> {
    // System.out.println(numbers);
    // });

    Map<String, Integer> ages = new HashMap<>();
    ages.put("Peter", 18);
    ages.put("Paul", 19);
    ages.put("Mary", 20);

    // BiConsumer<String, Integer> printNameAndAge = (name, age) ->
    // System.out.println(name + " is " + age + "years old");

    // for loop
    // inside map for each is Key and Values
    ages.forEach((name, age) -> {
      System.out.println("doSomeThing");
    });

  }
}
