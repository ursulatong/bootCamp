public class Casting {

  public static void main(String[] args) {

    // Casting
    Number number = (byte) 1;
    Integer i = (Integer) number;

    System.out.println(i); // ClassCastException, cannot convert Integer to Integer as number is Number

  }
}
