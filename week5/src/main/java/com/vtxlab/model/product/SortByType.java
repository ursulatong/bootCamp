package com.vtxlab.model.product;

import java.util.Comparator;

public class SortByType implements Comparator<Product> {

  @Override
  public int compare(Product p1, Product p2) {
    return p1.getType().compareTo(p2.getType());
  }
}
