import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class AnimalUrsula { 

 private String name;       
 private String color;
 private int age;
 private int weight;

public AnimalUrsula () {

}

public AnimalUrsula (String name, String color,int age, int weight) {

this.name = name;
this.color = color;
this.age = age;
this.weight = weight;
}

//Method
public void setname (String name ) {
  this.name = name;
}

public void setcolor (String color) {
  this.color = color;
}

public void setage (int age){
  this.age = age;
}

public void setweight (int weight){
  this.weight = weight;
}

public String getname(){
  return name;
}

public String getcolor(){
  return color;
}

public int getage () {
  return age;
}

public int getweight (){
  return weight;
}

public void introduction() {
  System.out.println ("My name is " + getname() + "." + " " + "I am " + getcolor() + ".");
}

// Expected Output:
// Ursula: These are my animals : 
// Pig : My name is Pig. I am Pink. // for loop
// Dog : My name is Dog. I am Black.
// Cat : My name is Cat. I am White.
// Ursula: Animals, please stand in line by ages. 
// Animals: We are standing in line. (Cat, Pig, Dog)  // Array sort method
// Ursula: If your weight is over 5kg, please come to me. //if 
// Animals : Pig and Dog are coming.

  public static void main (String[] args) {

  System.out.println("Ursula : They are my animals. " );
  
  ArrayList<AnimalUrsula> animals = new ArrayList<>();
  AnimalUrsula animal1 = new AnimalUrsula ("Pig", "Pink", 3, 10);
  AnimalUrsula animal2 = new AnimalUrsula ("Dog", "Black", 4, 8);
  AnimalUrsula animal3 = new AnimalUrsula ("Cat", "White", 2, 5);
  animals.add(animal1);
  animals.add(animal2);
  animals.add(animal3);

  // for loop
  for (int i = 0; i <= animals.size(); i++) {
  }
  System.out.print("Pig :" );
  animal1.introduction();
  System.out.print("Dog :" );
  animal2.introduction();
  System.out.print("Cat :" );
  animal3.introduction();
  
  System.out.println("Ursula : Animals, please stand in line by ages.");
  // convert list to array
 // AnimalUrsula[] animalsArray = animals.toArray
  }
  }