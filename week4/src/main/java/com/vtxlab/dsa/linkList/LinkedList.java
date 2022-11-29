package com.vtxlab.dsa.linkList;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.vtxlab.dsa.linkList.singly.Node;

public class LinkedList {

  Node head;

  public LinkedList push(int newData) {
    Node node = new Node(newData);
    node.setNext(head);
    this.head = node;
    return this;
  }

  public Node peek() {
    return this.head;
  }

  public LinkedList deleteNode(int key) {

    Node temp = head;
    Node prev = null;

    // If first node data == key, early return. Reduce Complexity.
    // O(1)
    if (temp != null && temp.getData() == key) {
      head = temp.getNext(); // Changed head
      return this;
    }
    // O(n)
    while (temp != null && temp.getData() != key) {
      prev = temp;
      temp = temp.getNext();
    }
    // If key was not present in linked list
    if (temp == null) {
      return this;
    }
    // Unlink the node from linked list
    prev.setNext(temp.getNext());

    return this;
  }

  public void print() {
    Node tnode = head;
    while (tnode != null) { // search until tnode = null
      System.out.print(tnode.getData() + " ");
      System.out.print("The data is odd: " + tnode.isNodeDataOdd()); //
      tnode = tnode.getNext();
    }
  }

  public static void print(LinkedList ll) {
    Node tnode = ll.head;
    while (tnode != null) { // search until tnode = null
      System.out.print(tnode.getData() + " ");

      tnode = tnode.getNext();
    }
  }

  public static void main(String[] args) {
    // Create a singly linkedList
    LinkedList linkedList = new LinkedList();
    linkedList.push(5);
    linkedList.push(100);
    linkedList.push(30).push(20).push(200).deleteNode(100).push(40).print();

    System.out.println("");
    LinkedList.print(linkedList);

    System.out.println("");
    System.out.println(linkedList.head.getNext().getNext().getData());

    Set<Integer> integers = new HashSet<>();
    integers.add(100);
    integers.add(5);
    integers.add(200);
    integers.add(100);
    integers.add(21);
    integers.add(213331);
    System.out.println(integers);

    List<Integer> intergers = new ArrayList<>();
    integers.add(100);
    integers.add(5);
    integers.add(200);
    integers.add(100);
    integers.add(21);
    integers.add(213331);
    System.out.println(integers);

  }
}