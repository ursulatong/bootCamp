package com.vtxlab.utility;

import java.util.Arrays;

import com.vtxlab.interfaces.SortHelper;

public class SortUtil {
  public static final void sort(int[] arr, SortHelper sortHelper) {
    sortHelper.sort(arr);
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static final void print(int[] arr) {
    for (int i : arr) {
      System.out.println(i + ", ");
    }
  }

  public static void insertionSort(int[] arr) {

    for (int i = 0; i <= arr.length - 2; i++) {
      int n = 0;
      int newValue = arr[i + 1];
      int oldValue = arr[i];
    }
  }

  public static void selectionSort(int[] arr) {

    // 11,5,7,19,4,1,7 i =0?
    // result: 1,4,5,7,7,11,19
    int i, j;

    for (i = 0; i < 1; i++) { // 0,1
      int min = arr[i]; // 11
      int index = 0;
      int temp = 0; //
      boolean needSwap = false;
      // 2nd loop : compare the remaining number
      for (j = i + 1; j < arr.length; j++) { // j =
        if (arr[j] < min) { //
          min = arr[j]; //
          index = j;
          needSwap = true;
        }
      }
      temp = arr[i]; // move 11 to temp
      arr[i] = min;
      arr[index] = temp;
      // System.out.println(temp); // 1
    }
  }

  public static void main(String[] args) {
    int[] arr = { 11, 5, 7, 19, 4, 1, 7 };
    // insertionSort(arr);
    selectionSort(arr);
    print(arr);
  }
}
