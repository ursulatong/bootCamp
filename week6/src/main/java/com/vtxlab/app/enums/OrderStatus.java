package com.vtxlab.app.enums;

import java.util.Arrays;

enum OrderStatus {

  ORDERED(1), // numbers are for the storing in the database
  PAID(2),
  READY_TO_SHIP(3),
  DELIVERED(4),
  DEFAULT(99),
  ;

  private int code;

  private OrderStatus(int code) {
    this.code = code;
  }

  public static OrderStatus fromCode(int code) {
    for (OrderStatus o : OrderStatus.values()) {
      if (o.code == code) {
        return o;
      }
    }
    return OrderStatus.DEFAULT;

  }

  public static OrderStatus fromCode2(int code) {
    // Stream
    // Orderstatus.values() returns Orderstatus[]
    // FindFirst() -> return ?
    // if not found?
    // throw OrderStatus.DEFAULT
    // Optional.orElse
    return Arrays.stream(OrderStatus.values()) // OrderStatus.values() return an array
        .filter(e -> e.code == code)
        .findFirst()
        .orElse(OrderStatus.DEFAULT);
  }

  public static OrderStatus fromCode3(int code) throws IllegalAccessException {
    return Arrays.stream(OrderStatus.values()) // OrderStatus.values() return an array
        .filter(e -> e.code == code)
        .findFirst()
        .orElseThrow(() -> new IllegalAccessException());
  }

  // public static Optional<OrderStatus> fromCode3(int code) {
  // return Arrays.stream(OrderStatus.values()) // OrderStatus.values() return an
  // array
  // .filter(e -> e.code == code)
  // .findFirst();

}
