package com.vtxlab.model;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueExample {

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    for (int i = 0; i < 5; i++) {
      q.add(i);
    }

    System.out.println("Elements of queue" + q);

    int removedElement = q.remove();
    System.out.println("removed element-" + removedElement);

    System.out.println(q);

    int head = q.peek();
    System.out.println("head of queue-" + head);

    System.out.println("removed head of queue" + q.poll());
    System.out.println(q);

  }
}