public class AnimalInheritance {
}

enum Size {

  SMALL('S'), MEDIUM('M'), LARGE('L');

  char letterSize;

  Size(char letterSize) {
    this.letterSize = letterSize;
  }
}

class Animal {

  private String name;
  private int age;
  private Size size;

  Animal() {

  }

  Animal(String name, int age, Size size) {
    this.name = name;
    this.age = age;
    this.size = size;
  }

  public Size setSize(Size size) {
    return size;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void sound() {
    System.out.println("Make Sound");
  }

  public void run() {
    System.out.println("Run");
  }

  public void printStates(String name, int age, Size size) {
    System.out.print("Name :" + name + " Age :" + age + " Size :" + size);
  }
}

class Cat extends Animal {

  Cat(String name, int age, Size size) {
    super(name, age, size);
  }

  @Override
  public void sound() {
    System.out.println("Meo Meo");
  }

  @Override
  public void run() {
    System.out.println("run");
  }
}

class Dog extends Animal {

  // calling superclass constructor

  public Dog(String name, int age, Size size) {
    super(name, age, size);
  }

  @Override
  public void sound() {
    System.out.println("bark bark");
  }

  @Override
  public void run() {
    System.out.println("run");
  }

  public static void main(String[] args) {

    Dog dog1 = new Dog("Momo", 1, Size.SMALL);
    Cat cat1 = new Cat("Hello Kitty", 1, Size.SMALL);

  }
}
