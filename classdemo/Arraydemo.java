import java.util.ArrayList;
import java.util.List;

public class Arraydemo {

  public static void main(String[] args) {

    int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };

    for (int my_array : arr) {
      System.out.println(arr); // print 1,2,3,4,5,6,7
    }

    int[] intergers = new int[] { 1, 2, 10, 7 }; // array

    int pool = 0;
    for (int i = 0; i <= intergers.length; i++) {
      if (intergers[i] >= 10) {
        pool = pool + intergers[i];
        // break;
      }
      if (intergers[i] >= 5) {
        pool = pool + intergers[i];
      } else {
        pool = pool - intergers[i];
      }
    }
    System.out.println(pool);
  }

  // creat an animal list
  List<String> myAnimalList = new ArrayList<>();
  {// ArrayList is a class inside package List
   // creat new animal
    myAnimalList.add("Cat");
    myAnimalList.add("Dog");
    myAnimalList.add("Pig");

    for (String myAnimalList2 : myAnimalList) {
      System.out.println(myAnimalList2);
    }
  }
}
