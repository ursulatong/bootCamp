public class Password {

  private String password;

  public Password(String x) {
    this.password = x;
  }

  public static String concat(String x, String y) {
    return y.toLowerCase().toUpperCase();

  }

  public static void main(String[] args) {

    int counter = 0;
    Password p1 = new Password("Start ");
    System.out.println(p1.concat("XYZ", "abc"));

  }

}
