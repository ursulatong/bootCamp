package com.vtxlab.app.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FIlesExceptionTest {

  public static void main(String[] args) throws IOException {

    String filePath = "C:\\Users\\ursula\\class\\week6\\src\\main\\java\\com\\vtxlab\\app\\exceptions\\someFile.txt";
    StringBuilder sb = new StringBuilder();
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = br.readLine()) != null) {
        sb.append(line).append("abc");
      }
    }
    System.out.println(sb.toString());
  }
}
