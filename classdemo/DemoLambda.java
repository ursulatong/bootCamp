
// functional interface means an interface has on abstract method only
@FunctionalInterface
interface Substraction1 {
  int substract(int x);
}
// unnecessary coding for Functional Interface

@FunctionalInterface
interface Substraction2 {
  int substract(int x, int y);
}

@FunctionalInterface
interface Substraction3 {
  int substract(int x);
}

class Abc implements Substraction1 {

  public int substract() {
    return 2;
  }
}

public class DemoLambda {

  public static void test(Substraction1 s) {
    System.out.println(s.substract());
  }

  public static void main(String[] args) {

    // Normal handling by creating a Class and implements the interface
    Abc abc = new Abc();
    Substraction1 sub1 = new Abc();
    sub1.substract();

    System.out.println(abc.substract()); // print 2

    // Althernative
    Substraction1 a = () -> 2; // () means no input parameters

    Substraction2 s;
    if (a.substract() == 2) {
      s = (x, y) -> x - y + 2; // with 2 parameters x and y
    } else {
      s = (x, y) -> x - y + 4; // with 2 parameters x and y
    }

    DemoLambda.test(() -> 99); // print 99

    Substraction2 s = (x, y) -> x - y + 2; // with 2 parameters x and y
    Substraction2 s1 = (x, y) -> x - y + 4;

    Substraction3 e = x -> x + 2; //
    System.out.println(a.substract()); // print 2
    System.out.println(e.substract(10)); // print 12
    System.out.println(s.substract(4, 2)); // print 4
    System.out.println(s.substract(6, 3)); // print 5
    System.out.println(s.substract(9, 4)); // print 7
  }
}
