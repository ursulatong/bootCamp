package com.vtxlab.app.exceptions;

public class PizzaOrderingException extends ArrayIndexOutOfBoundsException {

  public PizzaOrderingException() {
    super();
  }

  public <T> void order(T t) {
    try {
      if (t instanceof Integer[]) {
        Integer[] integers = (Integer[]) t;
        // an implementation with instance is required to be instantiated inside an
        // generic method
        integers[integers.length] = 1; // error
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index is Out Of Bounds");
    }
  }
}