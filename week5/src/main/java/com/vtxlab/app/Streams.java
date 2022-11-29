package com.vtxlab.app;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

  public static void main(String[] args) {

    List<String> names = Arrays.asList("Peter", "Carl", "Benny", "Alex", "Benny");

    Predicate<String> containC = e -> e.contains("C");
    Predicate<String> containB = e -> e.contains("B");
    Predicate<String> lengthLessThan5 = e -> e.length() < 5;

    Function<String, String> returnSelf = e -> e;
    Function<String, String> toUpperCase = e -> e.toUpperCase();
    Function<String, String> toSubString = e -> e.substring(0, 3);
    // names (list)
    // filtering
    // names.stream is a form to apepend other methods
    // after filtering, the form of the List is still in stream
    List<String> filteredNames = names.stream()
        .map(toUpperCase.andThen(toSubString))
        .filter(containB.and(lengthLessThan5)) // intermediate operation
        .collect(Collectors.toList()); // terminal operation //

    List<String> newNames = names.stream()
        .map(toUpperCase.andThen(toSubString))
        .filter(containB.and(lengthLessThan5)) // intermediate operation
        .collect(Collectors.toList()); // terminal operation //
    System.out.println(newNames); // Ben Ben

    // Set data type cannot save duplicated element
    Set<String> removeDuplicated = names.stream()
        .collect(Collectors.toSet()); // terminal operation //
    System.out.println(removeDuplicated); // "Peter", "Carl", "Benny", "Alex"

    Stream<String> streams = names.stream()
        .filter(name -> name.contains("C")); // intermediate operation
    System.out.println(filteredNames); // Alex

    // use stream to new an arrayList

    // stream.iterate()
    List<Integer> numbers = Stream.iterate(1, n -> n + 2) // intermediate operation
        .limit(10) // intermediate operation
        .collect(Collectors.toList()); // terminal operation
    System.out.println(numbers);

    // stream.reduce()
    Integer reduced = numbers.stream()
        .reduce(0, (a, b) -> a - b);
    System.out.println(reduced);

    List<Integer> numberlist = Arrays.asList(9992, 2121, 2184, 5539, 3120);
    Optional<Integer> optional = numberlist.stream()
        .max((o1, o2) -> o1.compareTo(o2));

    optional.ifPresent(e -> {
      System.out.println(e);
    });

    long streamCount = Stream.of(1, 2, 3).map(i -> {
      System.out.println(i);
      return i;
    }).count(); // terminal operation determine which method should be used

    System.out.println(streamCount);
  }
}
