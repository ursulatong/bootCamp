public class CustomException extends Exception {

  public CustomException() {

  }

  public CustomException(String msg, Throwable e) {
    super(msg, e);
  }

  public static void test() throws CustomException {

    try {
      throw new Exception();
    } catch (Exception e) {
      // TODO: handle exception
    }
  }

  public static void main(String[] args) throws Exception {

    test();

  }
}
