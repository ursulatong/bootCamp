
public class DataType {

  private int x;

  // 1.1 void mean no return Type
  public static void getReturnValue() {
    int i = 0;
    return; // no return type
  }

  // 1.2
  public static void getReturnValue2() { // if void does not have return statement, implement to the last
    int i = 0;
    if (i == 0) { // early retun
      return; // will not enter line 16
    }
    int b = 9;
    int c = 4;
    // return;
    // double b = 0;
  }

  // 2. without void
  public int getReturnValue3(int x) {
    return x; // return the type of input parameter

  }

  // 3. pass by value, pass by reference (wapper class must be passed by value)
  // primitive, object

  // pass by value
  public static int calculate(int x) {
    x = x + 1;
    return x;
  }

  public static void main(String[] args) {

    String r = "ABC";
    String y = "ABC";
    System.out.println(r == y); // true
    // check the object reference

    String a = "ABC";
    String b = "ABC";
    System.out.println(a.equals(b)); // true
    // check the value of the object

    String r1 = new String("ABC");
    String y1 = new String("ABC");

    System.out.println(r1 == y1); // false
    // check the object reference

    String a1 = new String("ABC");
    String b1 = new String("ABC");
    System.out.println(a1.equals(b1)); // true
    // check the value of the object

    String r2 = "ABC";
    String y2 = "BCD";

    System.out.println(r2 == y2); // false

    String r3 = new String("ABC");
    String y3 = new String("BCD");

    System.out.println(r3 == y3); // false

  }
}
