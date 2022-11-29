import java.util.Optional;

public class TestingOptional {

  public String getName() {
    return "Tommy";
  }

  public static Optional<String> getOptionalName() {
    // access DataBase, get Value
    // return Optional.of("Tommy");
    // return Optional.empty();
    return Optional.ofNullable(null);

  }

  public static void main(String[] args) {

    Optional<String> s = getOptionalName();

    String s2 = s.orElse("Steve"); // NoSuchElementException:
    System.out.println(s2);

    s.ifPresent(e -> {
      System.out.println(s.get());
    });

    Optional<String> opt2 = Optional.ofNullable(null);
    String defaultWithOrElse2 = opt2.orElse("default value");
    System.out.println(defaultWithOrElse2);

    s.ifPresent(e -> {
      System.out.println(e.length());
    }); // ifPresend -> Consumer (void)
  }

}
