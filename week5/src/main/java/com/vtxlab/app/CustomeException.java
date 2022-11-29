package com.vtxlab.app;

public class CustomeException extends RuntimeException {

  // class can not inheritate the constructor of class
  public CustomeException(String msg) { // create a new constructor of the extended class
    super(msg);
  }

}
