package com.vtxlab.app;

import java.util.Hashtable;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class HashMapExample {

  int x, y;

  public static void main(String[] args) {

    Hashtable<Integer, String> hashtable1 = new Hashtable<>();

    // 2. Add mappings to hashtable, self-define the key
    hashtable1.put(1, "A");
    hashtable1.put(2, "B");
    hashtable1.put(3, "C");
    hashtable1.put(3, "D");
    // overwrite the key 3 with value "C"

    System.out.println(hashtable1);

    // 3. Access a mapping by key
    String value2 = hashtable1.get(1);
    System.out.println(value2);

    // 4. Remove a mapping
    hashtable1.remove(3); // 3 is deleted

    Map<Integer, String> ht = new Hashtable<>();
    ht.put(101, "Ajay");
    ht.put(101, "Vijay");
    ht.put(102, "Ravi");
    ht.put(103, "Rahual");
    ht.size();

    ht.forEach((x, y) -> {
      if (x == 101) {
        System.out.println(y);
      }
    });

    System.out.println("------Hash Table------");
    for (Map.Entry m : ht.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }

    Map<Integer, List<String>> ht2 = new Hashtable<>();
    // Entry 1
    List<String> strings6 = new ArrayList<>();
    strings6.add("abc");
    strings6.add("bcd");
    ht2.put(101, strings6);

    // Entry 2
    List<String> strings7 = new ArrayList<>();
    strings7.add("abcd");
    strings7.add("bcde");
    ht2.put(102, strings7);
    ht2.size();
    ht2.containsKey(101);
    ht2.toString();

    for (Map.Entry<Integer, List<String>> m : ht2.entrySet()) {
      for (String s : m.getValue()) {
        System.out.println(s);
      }
    }
  }
}
