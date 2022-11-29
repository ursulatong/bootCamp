package com.vtxlab.model.generics;

// provide flexibity to Customer to instaniate age
public class Customer<T> {

  // age can return anything, not only int age
  private T age;

  public T getAge() {
    return this.age;
  }

  public void setAge(T age) {
    this.age = age;
  }

  // <T extends Number> detemine the field of T , cannot be String etc, only for
  // types Number
  public static <T extends Number> T calcAge(T a) {
    return a;
  }

  public static <T extends Number> T calcAge2(Customer<T> a) {
    return a.getAge();
  }

}
