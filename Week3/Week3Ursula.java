enum Type { // implicity public static final
  CLOTHES(1, 'A'), TOYS(2, 'B'), FURNITURE(3, 'C');

  // no consturctor
  int code;
  char value; // no get,set method, thus no private or public

  Type(int code, char value) {
    this.code = code;
    this.value = value;
  }

  public boolean isOrderType() {
    if (this.value == 'A' || this.value == 'B'
        || this.value == 'C') {
      return true;
    } else
      return false;
  }

  public static Type getType(int code) {
    for (Type i : Type.values()) {
      if (i.code == code) {
        return i;
      }
    }
    return null;
  }
}

interface Status { // functional interface which only carries with method

  void complete();
}

interface Delivery {

  void delivered();
}

class Enquiry implements Status {

  String type;

  @Override
  public void complete() {
    System.out.println("Enquiry completed");

    // getter and setter
    // constructor
    // create instance
  }
}

class Afterservice extends Order {

  // create an database where has 10 index
  static String[] database = new String[10];
  String date;

  // this is a method to override the toString() method in Object superClass
  @Override
  public String toString() {
    return "[date=" + date + 
  }

  @Override
  public void complete() {
    System.out.println(" Afterservice Completed");
  }

  @Override
  public void delivered() {
    System.out.println("Aterservice delivered");
  }

  void save(String string) {
    boolean isStringStoredInDatabase = false;

    //
    for (int i = 0; i < 10; i++) {
      if (database[i] == null) {
        isStringStoredInDatabase = true;
        database[i] = string;
        break;
      }

    }
    // if database has not enough space to save addition string
    // always replace index 0 of database
    if (!isStringStoredInDatabase) {
      database[0] = string;
    }
  }

  // we can delete the last element of the database only if the element is not
  // null
  void delete() {
    boolean previousIndexHasValue = false;
    for (int i = 0; i < database.length; i++) {
      if (database[i] != null) { // contains value
        previousIndexHasValue = true;
      }
      if (previousIndexHasValue && database[i] == null) { // delete
        // condition
        database[i - 1] = null;
        previousIndexHasValue = false;
      }
      if (previousIndexHasValue && database[i] != null && i == database.length - 1) {
        database[i] = null;
      }
    }
  }

  void delete2() {
    boolean previousIndexHasValue = false;
    for (int i = 1; i < database.length; i++) {
      if ((database[i - 1] != null && database[i] == null) && (i != database.length)) {
        database[i - 1] = null;
      }
    }
  }
}

class SalesDeparment {

  // don't need to new a object because Status is a functional interface
  public static Status createstarter(int type) {
    if (type == 1) {
      return new Order();
    } else if (type == 2) {
      return new Enquiry();
    }
    return new Enquiry();
  }

  // A better way for factory pattern
  public static Status createstarterwithlamda(int type) {
    if (type == 1) {
      return () -> System.out.println("Order completed");
    } else if (type == 2) {
      return () -> System.out.println("Enquiry completed");
    }
    return () -> System.out.println("Error");
  }
}

class Order implements Status, Delivery {

  @Override
  public void complete() {
    System.out.println("Order completed");
  }

  @Override
  public void delivered() {
    System.out.println("Order delivered");
  }

  public static int counter;
  private String name;
  private String type;
  private int numoforder;

  Order() {
    Order.counter = Order.counter + 1;
  }

  Order(String name, String type, int numoforder) {
    this.name = name;
    this.type = type;
    this.numoforder = numoforder;
    Order.counter = Order.counter + 1;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setNumofOrder(int numoforder) {
    this.numoforder = numoforder;
  }

  public String getName() {
    return this.name;
  }

  public String getType() {
    return this.type;
  }

  public int getNumofOrder() {
    return this.numoforder;
  }

  // step 7 - private static field can be retrieved by static method
  public static int getOrderCounter() {
    return Order.counter;
  }

  // step 7
  public static Order getEmptyOrder() {
    return new Order();
  }
}

public class Week3Ursula {

  public static void main(String[] args) {

    Order order = new Order();
    order.setName("Ursula");
    order.setType("Clothes");
    order.setNumofOrder(1);
    System.out.println(order.getName());
    System.out.println(order.getType());
    System.out.println(order.getNumofOrder());

    Order order2 = new Order("Tom", "Toys", 2);
    System.out.println(order2.getName());
    System.out.println(order2.getType());
    System.out.println(order2.getNumofOrder());

    System.out.println(Order.counter);

    Order order3 = Order.getEmptyOrder();

    order.complete();

    Status status = new Order(); // create a new order and the order is completed
    status.complete(); // return complete status

    Status status2 = () -> {
      System.out.println(" Not completed"); // Lamda expression
      System.out.println("Ignore me, epxress lamda expression only");
    };
    status2.complete(); // return Not completed, Ignore me...

    Status StarterHolder = SalesDeparment.createstarter(1);

    Starter starterHolder2 = StarterFactory.createStarterByLambda(2); // 1 or 2
    starterHolder2.start();
    // starterHolder.stop(); // Compile error, we need a StopperFactory
    // Step 12

    Afterservice afterservice = new Afterservice();
    afterservice.setName("ABC");
    afterservice.getType("Clothes");
    System.out.println(afterservice.getName);

    laptop.start();
    System.out.println(laptop.toString()); // nothing to print

    Laptop laptop = new Laptop();
    laptop.save("1");
    laptop.save("2");
    laptop.save("3");
    laptop.save("4");
    laptop.save("5");
    laptop.save("6");
    laptop.save("7");
    laptop.save("8");
    laptop.save("9");
    laptop.save("10");
    laptop.save("11");
    laptop.delete();
    laptop.delete();

    for (String string : Laptop.database) {
      System.out.println(string);
    }

    if (Type.TOYS.isOrderType()) {
      System.out.println("I am the order type");
    } else {
      System.out.println("Not in the pool");
    }

  }
}