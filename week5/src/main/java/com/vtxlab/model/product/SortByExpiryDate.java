package com.vtxlab.model.product;

import java.util.Comparator;

public class SortByExpiryDate implements Comparator<Product> {

  @Override
  public int compare(Product p1, Product p2) {
    // return p1.getExpiryDate().compareTo(p2.getExpiryDate()); // asscending
    return p2.getExpiryDate().compareTo(p1.getExpiryDate()); // desscending
  }
}
