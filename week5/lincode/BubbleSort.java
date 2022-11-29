public class BubbleSort {

  static void BubbleSort(int[] arr) {

    int i, j, temp;
    temp = 0;

    for (i = 0; i < arr.length - 1; i++) { // //0,1,2,3

      for (j = 1; j < arr.length - 1; j++) { // 0,1,2,3,4
        if (arr[j - 1] > arr[j])
          ; // 1,2,3,4
        temp = arr[j - 1]; // 5,5,5
        arr[j - 1] = arr[j]; // 1,4,2
        arr[j] = temp; // 5,5,5
      }
    }
  }

  public static void main(String[] args) {

    int arr[] = new int[] { 5, 1, 4, 2, 8 };
    // Output: 1, 2, 4, 5, 8
    // 1,5,4,2,8
    // 1,4,5,2,8
    // 1,4,2,5,8
    // 1,2,4,5,8
    System.out.println("Before Sorting :");
    for (int element : arr) {
      System.out.println(element);

      BubbleSort(arr);
      for (int element1 : arr) {
        System.out.println(element1);
      }

    }
  }
}
