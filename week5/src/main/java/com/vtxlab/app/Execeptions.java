package com.vtxlab.app;

public class Execeptions {

  public static void main(String[] args) {
    int i = 0;

    int y = 2;
    /*
     * as we know 2/0 will throw ArithmeticException, we are trying to do sth
     * if this exception happen
     */
    try {
      y = y / i; // ArithmeticException: / by zero
      // ... // may have others exception in this block
      // ...
    } catch (ArithmeticException e) {
      y = 0;

    }

    System.out.println(y);

  }
}
