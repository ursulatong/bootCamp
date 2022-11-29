import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeArrayLists {

  // Combine multiple lists into a single list
  // 1. Merging Two ArrayLists Retaining All Elements
  // 2. Merging Two ArrayLists Excluding Duplicate Elements

  public static void main(String[] args) {

    // 1.1. Using List.addAll()
    ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c"));
    ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("c", "d", "e"));

    listOne.addAll(listTwo); // Merge both list, .addALL method append elements in the tail

    System.out.println(listOne); // print [a, b, c, c, d, e]
    System.out.println(listTwo); // print [c, d, e]

    // 1.2. Using Stream.flatMap()
    List<String> combinedList = Stream.of(listOne, listTwo)
        .flatMap(x -> x.stream())
        .collect(Collectors.toList());

    System.out.println(combinedList); // print [a, b, c, c, d, e, c, d, e]

    // 2.1 Using LinkedHashSet
    ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
    ArrayList<String> list2 = new ArrayList<>(Arrays.asList("c", "d", "e"));

    // Add items from Lists into Set
    Set<String> set = new LinkedHashSet<>(list1);
    set.addAll(list2); // merge list2 into list1

    // convert Set to ArrayList
    ArrayList<String> combinedList2 = new ArrayList<>(set);

    System.out.println(combinedList2); // print []

  public void getReturnValue() {
    int i = 0;
    return; 
    }
      
  

  }
}
