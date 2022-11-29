import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

enum Food {
  VEGETABLE('V'), MEAT('M'), FRUIT('F');

  char key;

  Food(char c) {
    this.key = c;
  }
}

public class Quiz13 {

  public static void main(String[] args) {

    List<Food> foods = new ArrayList<>();
    foods.add(Food.VEGETABLE);
    foods.add(Food.MEAT);
    foods.add(Food.FRUIT);

    System.out.println(foods);

    List<Character> mappedList = foods.stream()
        .map(e -> e.key) // map is used to convert value
        .filter(e -> Character.isLowerCase(e))
        .sorted()
        .collect(Collectors.toList());

    System.out.println(mappedList);
  }
}
