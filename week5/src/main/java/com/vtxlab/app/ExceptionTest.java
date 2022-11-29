package com.vtxlab.app;

public class ExceptionTest {

  public static void main(String[] args) {

    try {
      String a = null; // null value
      char b = a.charAt(0);
    } catch (NullPointerException e) {
      System.out.println("NullPointerException..");
    }
  }
}
