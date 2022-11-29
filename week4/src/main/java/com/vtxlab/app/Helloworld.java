package com.vtxlab.app;

import java.util.List;
import java.util.ArrayList;

import com.vtxlab.utility.SortUtil;
import com.vtxlab.infra.Foundation;
import com.vtxlab.interfaces.SortHelper;
import com.vtxlab.model.Customer;

public class Helloworld {

  public static void main(String[] args) { // main
    System.out.println("I am Vicent, Hello"); // sysout

    Customer customer = new Customer();
    customer.setName("Vincent");
    System.out.println(customer.getName());

    // Lambda

    List<Customer> customers = new ArrayList<>();
    customers.add(new Customer());
    customers.add(new Customer());

    for (Customer c : customers) {
      System.out.println(c.getName());
    }

    // forEach method by Lambda
    customers.forEach(abc -> System.out.println(abc.getName()));

    String s = "abc";
    System.out.println(s.concat("bcd"));

    StringBuilder sb = new StringBuilder("start");
    // sb = sb.append("class");
    System.out.println(sb.append("class"));

    Foundation.println("Testing Self-build Java Library");
    Foundation.print(s);

  }
}
