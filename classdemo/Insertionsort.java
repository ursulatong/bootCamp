import java.util.Arrays;

public class Insertionsort {

  private int inputarr;

  public static void insertionSort(int[] inputarr) {

    int i, j, temp; //

    for (i = 1; i < inputarr.length; i++) { // 1,2,3
      temp = inputarr[i]; // 11,13,5
      j = i - 1; // 0,1,2
      while (j >= 0 && inputarr[j] > temp) { // 12,11/ 12,13/13,5
        inputarr[j + 1] = inputarr[j]; // 12,13
        j--; // -1,1
      }
      inputarr[j + 1] = temp; // 11, 13
    }
    System.out.println(Arrays.toString(inputarr));
  }

  public static void main(String[] args) {

    // 12,11,13,5,6
    // 11,12,13,5,6
    // 11,12,13,5,6

    // 12 compare 11, 11 < 12 ->swap (11,12,13,5,6)
    // 12 compare 13, 13 > 12 (11,12,13,5,6)
    // 13 compare 5, 5 < 13 ->swap (11,12,5,13,6)
    // 5 compare 12, 5 < 12 -> swap (11, 5, 12 ,13, 6)
    // 5 compare 11, 5< 11 -> swap (5,11, 12, 13, 6)
    // 6 compare 13, 6 < 13 -> swap (5, 11, 12, 6, 13)
    // 6 compare 12, 6 < 12 -> swap (5, 11, 6, 12, 13)
    // 6 compare 11, 6 < 11 -> swap (5, 6, 11, 12, 13)
    // 6 compare 5, 6 > 5, break

    int[] inputarr = new int[] { 12, 11, 13, 5, 6 };
    System.out.println("Before" + Arrays.toString(inputarr));
    System.out.println("After");
    Insertionsort.insertionSort(inputarr);
  }
}
