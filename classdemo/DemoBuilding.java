import java.util.ArrayList;

class Height {

  private double height; // cm
  // int heightInMetres;

  public double getHeightIncm() {
    return this.height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public double getHeightInMetres() {
    return this.height / 100;
  }
}

class Building {

  // attribute
  private Height height; // cm
  // constructor

  public Building() {

  }
  // method

  public Height getHeight() {
    return this.height;
  }

  public void setHeight(Height height) {
    this.height = height;
  }
}

class ShoppingMall extends Building {
  private final Conceirge conceirge;

  // no set method because final, need to build constructor
  ShoppingMall() {
    this.conceirge = new Conceirge();
  }

  public Conceirge getConceirge() {
    return this.conceirge;
  }
}

class Conceirge {

  private final ArrayList<Receptionist> receptionists = new ArrayList<>();

  Conceirge() {
    this.receptionists.add(new Receptionist("Alan", "Ho", "123"));
    this.receptionists.add(new Receptionist("Sunny", "Ng", "234"));
    this.receptionists.add(new Receptionist("Amir", "Yu", "1234"));
  }

  public ArrayList<Receptionist> getReceptionists() {
    return this.receptionists;
  }
}

class Receptionist {
  private final String firstname;
  private final String lastname;
  private final String staffNo;

  Receptionist(String firstname, String lastname, String staffNo) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.staffNo = staffNo;
  }
}

public class DemoBuilding {

  public static void main(String[] args) {
    // create building Object
    Building building = new Building();
    // create height object
    Height height = new Height();
    // set height to the object in cm
    height.setHeight(13);
    building.setHeight(height);

    System.out.println(building.getHeight().getHeightIncm()); // print 13
    System.out.println(building.getHeight().getHeightInMetres()); // print 0.13

    for (Receptionist a : receptionists) {
      System.out.println(getReceptionists);
    }
  }
}