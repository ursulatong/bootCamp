import java.util.ArrayList;

interface Workouti {

  public void squat(int a);

  public void situp(int b);
}

class Customer implements Workouti {

  private String name;
  private int totalnum = 0;

  // Constructor
  public Customer() {
  }

  public void setname(String name) {
    this.name = name;
  }

  public String getname() {
    return name;
  }

  public int numofworkout(int a, int b) {
    return (a + b);
  }

  // method inheritated from interface
  public void squat(int a) {
    System.out.println("Squat : " + a);
    totalnum = totalnum + a;
  }

  public void situp(int b) {
    System.out.println("Situp : " + b);

  }

  public class Interfaceclass {
    // find out whose workout hours is the maximum
    public static void main(String[] args) {

      Customer customer1 = new Customer();
      customer1.setname("Ursula");
      System.out.println("Customer1 : " + customer1.getname());
      customer1.squat(100);
      customer1.situp(80);
      customer1.numofworkout(100, 80); //

      Customer customer2 = new Customer();
      customer2.setname("David");
      System.out.println("Customer2 : " + customer2.getname());
      customer2.squat(80);
      customer2.situp(150);
      customer2.numofworkout(80, 150);

      Customer customer3 = new Customer();
      customer3.setname("Tom");
      System.out.println("Customer3 : " + customer3.getname());
      customer3.squat(50);
      customer3.situp(100);
      customer3.numofworkout(50, 100);

      // put 3 customer's numofworkout in the ArrayList
      ArrayList<Integer> totalworkouthours = new ArrayList<>();
      // how to define 180 is customer1?
      totalworkouthours.add(180); // cannot just add customer1.numofworkout in ?
      totalworkouthours.add(230);
      totalworkouthours.add(150);

      int maxnum = 0; // create a temp max variable and initialize with 0

      for (Integer a : totalworkouthours) {
        if (a > maxnum) {
          maxnum = a;
        }
        System.out.println("The maximum workouthours of customer is " + maxnum);
        // find out the maximum working hours
        // how to match the maxnum to the specific customer?
      }
    }
  }
}
