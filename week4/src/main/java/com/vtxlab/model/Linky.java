package com.vtxlab.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linky {

  public static void main(String[] args) {

    LinkedList<Integer> linky = new LinkedList<>();

    linky.add(6);
    linky.add(78);

    System.out.println(linky.get(1));

    Iterator it = linky.iterator();
    while (it.hasNext()) {
      if ((int) it.next() == 78) {
        System.out.println("We found 78");
      }
    }
    System.out.println(linky.isEmpty());

    List<String> names = new ArrayList<>();

    names.add(1, "Peter");
    names.add(2, "Vincent");
    names.add(3, "David");

    System.out.println(names.get(1));
  }
}
