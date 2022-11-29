package com.vtxlab.infra;

import static java.lang.System.out;

public class Foundation {

  public static void println(String x) {
    out.println(x);
    // control somthing...
    // log something, housekeep, send email, check x if any issue
  }

  public static void print(String x) {
    out.println(x);
  }

}
