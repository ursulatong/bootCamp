package com.vtxlab.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.vtxlab.model.product.Product;
import com.vtxlab.model.product.SortByExpiryDate;

public class ProductHolder {

  public static void main(String[] args) {

    Product product1 = new Product("Apple", 12, LocalDate.of(2022, 10, 30));
    Product product2 = new Product("Orange", 10, LocalDate.of(2022, 11, 8));
    Product product3 = new Product("Lemon", 6, LocalDate.of(2022, 10, 20));

    List<Product> products = new ArrayList<>();
    products.add(product1);
    products.add(product2);
    products.add(product3);

    System.out.println("Before Comparable : " + products);
    Collections.sort(products);
    System.out.println("After Comparable : " + products);

    System.out.println("Before Comparator : " + products);

    // Lamdba expression with creating class/method
    Comparator<Product> byexpiryDate = (p1, p2) -> p1.getExpiryDate().compareTo(p2.getExpiryDate());
    Collections.sort(products, byexpiryDate);
    System.out.println("After Sorting: " + products); // asscending

    // Comparator sorting by creating class
    SortByExpiryDate byExpiryDate = new SortByExpiryDate();
    Collections.sort(products, byExpiryDate);
    System.out.println("After Sorting: " + products); 
  }
}
