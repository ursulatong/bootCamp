import java.util.Deque;
import java.util.LinkedList;

class Car {

  int speed = 100;
  static Car instance = new Car();

  private Car() {

  }

  public static Car getInstance() {
    return instance; // return new Car()
  }

  public void setSpeed(int s) {
    this.speed = s;
  }

  public class Quiz12 {

    public static void main(String[] args) {
      Deque<Car> deque = new LinkedList<>();

      Car tesla = Car.getInstance(); // create new constructor
      Car toyota = Car.getInstance(); // create new constructor

      tesla.setSpeed(80);

      deque.add(tesla); // add last
      deque.push(toyota); // push head

      System.out.println(deque.getLast().speed + " " + deque.getFirst().speed);

    }

  }
}