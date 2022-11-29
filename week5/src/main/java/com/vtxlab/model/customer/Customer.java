package com.vtxlab.model.customer;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Annotation
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Customer implements Comparable<Customer> {

  private int id;

  private String name;

  private LocalDate joinDate;

  @Override
  public int compareTo(Customer c) {
    // System.out.println(Integer.compare(this.id, c.getId()));
    // return Integer.compare(this.id, c.getId()); // ascending order
    // return Integer.compare(c.getId(), this.id); // descending order
    // return this.id > c.getId() ? -1 : 1;
    // return c.getName().compareTo(this.name);
    return this.name.compareTo(c.getName());
  }

}
