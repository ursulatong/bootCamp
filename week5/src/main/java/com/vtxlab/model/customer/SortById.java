package com.vtxlab.model.customer;

import java.util.Comparator;

public class SortById implements Comparator<Customer> {

  @Override
  public int compare(Customer c1, Customer c2) {

    // return c1.getId() < c2.getId() ? -1 : 1; // ascending order
    return c2.getId() < c1.getId() ? -1 : 1; // dscending order
  }
}
