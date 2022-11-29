package com.vtxlab.app;

public class PizzaOrder {

  public PizzaOrder() {

    super();
  }

  public <T> void order(T t) {
    try {
      if (t instanceof Integer[]) {
        Integer[] integers = (Integer[]) t;
        integers[integers.length] = 1; // error
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index is Out Of Bounds");
    }
  }

  public static void main(String[] args) {

    Integer[] orders = new Integer[5];
    orders[1] = 1;
    orders[2] = 2;
    orders[3] = 3;
    orders[4] = 4;
    orders[5] = 5;
    orders[6] = 6;

    PizzaOrder pizzaOrder = new PizzaOrder();
    pizzaOrder.order(orders);

  }
}
