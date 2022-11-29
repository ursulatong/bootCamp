package com.vtxlab.demo.post2.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class TitleNotExistException extends RuntimeException {

  private int code;

  public TitleNotExistException(int code, String msg) {

    super(msg);
    this.code = code;

  }

}
