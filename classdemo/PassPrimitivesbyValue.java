public class PassPrimitivesbyValue {

  public static void dosomething(int x) {

    x = 99; // re-assign the value 99
    System.out.println(x); // print 99
  }

  public static void main(String[] args) {
    int x = 10;
    dosomething(15); // no relation with main class, pass value to the primitives
    System.out.println("x is" + x); // print 10
  }
}
