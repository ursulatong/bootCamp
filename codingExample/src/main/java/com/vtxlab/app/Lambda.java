package main.java.com.vtxlab.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;


public class Lambda {
  public static void main(String[] args) {
    Map<String, Integer> nameLengthMap = new HashMap<>();
   // nameLengthMap.put(12, 100);

   // We are writing a formula to calculate the length of input "String"
    // Function (receive one value and return one value)
    Function<String, Integer> computeLength = s -> s.length();  // (s = String, implementation: s.length = Integer)

    Integer computedValue = nameLengthMap.computeIfAbsent("Peter", computeLength);
    System.out.println(computedValue);

    System.out.println(nameLengthMap.get("Peter"));
    
    // BiFunction
    Map<String, Integer> nameFrequencyMap = new HashMap<>();
    nameFrequencyMap.put("Peter", 3);

    

  }
}
  

