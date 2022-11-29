import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ReHashMap {

  public static void main(String[] args) {

    Map<Integer, Integer> map = new HashMap<>();
    map.put(1, 100); //
    map.put(3, 300);
    map.get(3); // return 300
    map.remove(3); // remove by key

    Map<Integer, String> map2 = new HashMap<>();
    map2.put(3, "Tommy");
    map2.put(3, "Sunny");
    // map2.put(4, null);

    try {
      Hashtable<Integer, String> table = new Hashtable<>();
      table.put(1, "Tommy");
      table.put(2, "Steve");
      table.put(3, "Gary");

      System.out.println(table.toString()); // NPE
      System.out.println(table.get(1)); // print Tommy

    } catch (NullPointerException e) { // catch NullPointerException
      System.out.println("The Key is Null !");

    }

  }

}
