package com.vtxlab.demo.coningecko.exception;

import lombok.Getter;

@Getter
public class ApiException extends Exception {

  Integer code;

  public ApiException(Integer code, String message) {
    super(message);
    this.code = code;
  }
  
  
}
