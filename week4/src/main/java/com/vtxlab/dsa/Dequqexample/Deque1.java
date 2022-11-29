package com.vtxlab.dsa.Dequqexample;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

public class Deque1 {

  public static void main(String[] args) {
    Deque<String> deque = new LinkedList<>();

    deque.add("Element 1 (Tail)");
    deque.addFirst("Element 2 (Head)");
    deque.addLast("Element 3(Tail)");
    deque.addFirst("Element 4(Head)");
    deque.offer("Element 5(Tail)");
    deque.push("Element 6 (Head)");
    deque.removeFirst();

    System.out.println(deque);
    System.out.println(deque.getFirst());
    System.out.println(deque.peekFirst());

    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(3);
    list1.add(2);
    list1.remove(1);
    list1.add(5);
    list1.add(4);

    System.out.println(list1);
    System.out.println(list1.size());

    Collections.sort(list1); // sort numbers in ascending order
    System.out.println("List after the use of" +
        " Collections.sort() :\n" + list1);

    Collections.reverse(list1); // sort numbers in descending order
    System.out.println("List after the use of Collection.reverseOrder()"
        + " and Collections.sort()" + list1);
  }

}
