package com.vtxlab.demo.post2.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString

public class KeyNotFoundException extends RuntimeException {

  private int code;

  public KeyNotFoundException(int code, String msg) {

    super(msg);
    this.code = code;
  }
}
