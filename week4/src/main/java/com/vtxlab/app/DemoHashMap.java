package com.vtxlab.app;

import java.util.Hashtable;
import java.util.Map;

public class DemoHashMap {

  public static void main(String[] args) {
    Hashtable<Integer, String> hashtable1 = new Hashtable<>();

    // 2. Add mappings to hashtable, self-define the key
    hashtable1.put(1, "A");
    hashtable1.put(2, "B");
    hashtable1.put(3, "C");
    hashtable1.put(4, "D");
    // overwrite the key 3 with value "C"

    System.out.println(hashtable1); // {3 = D, 2 =B, 1 =A}

    // 3. Access a mapping by key
    String value2 = hashtable1.get(1); // A
    System.out.println(value2);

    // 4. Remove a mapping
    hashtable1.remove(3); // 3 is deleted

    Map<Integer, String> ht = new Hashtable<>();
    ht.put(101, "Ajay");
    ht.put(101, "Vijay");
    ht.put(102, "Ravi");
    ht.put(103, "Rahul");
    ht.size();

    ht.forEach((x, y) -> {
      if (x == 101) {
        System.out.println(y);
      }
    });

  }

}
