package com.vtxlab.model.generics;

public abstract class Shape {

  public String color;

  abstract double area();

  public static <T extends Shape & Area> double calcArea(T t) {
    return t.area();
  }

  // same
  public static double calcArea2(Shape s) {
    return s.area();
  }
}
