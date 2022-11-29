package com.vtxlab.model.product;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Product implements Comparable<Product> {

  private String type;

  private int price;

  private LocalDate expiryDate;

  @Override
  public int compareTo(Product p) {
    return this.type.compareTo(p.getType());
  }

  public Product(int i, String string, String string2) {
  }

}
