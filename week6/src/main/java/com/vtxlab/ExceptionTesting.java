package com.vtxlab;

import com.vtxlab.app.enums.Exceptions;
import com.vtxlab.app.exceptions.MobileBackEndException;

public class ExceptionTesting {

  public static void main(String[] args) throws MobileBackEndException {

    String s = null;
    try {
      int l = s.length();
    } catch (NullPointerException e) {
      throw new MobileBackEndException(Exceptions.NPE);
    }

  }
}
