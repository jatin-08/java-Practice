// Implementing Count Sort Algorithm.

import java.util.*;

public class CountSort {

  // Creating an inputArray() -> It Takes input from the user.
  public static void inputArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a printArray() -> It print the element of the Array
  public static void printArray(int[] arr, int size) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  // Creating a findMax() -> It find the Max element from the Array
  public static int findMax(int[] arr, int size) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < size; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    return max;
  }

  // Creating a countSort() -> It return sorted Array by using of Count Sort Algorithm But it is not stable.
  public static void countSort(int[] arr, int size) {
    int max = findMax(arr, size);
    int[] count = new int[max + 1];
    for (int i = 0; i < size; i++) {
      count[arr[i]]++;
    }
    int k = 0;
    for (int i = 0; i < count.length; i++) {
      for (int j = 0; j < count[i]; j++) {
        arr[k++] = i;
      }
    }
  }

  // Creating a stableCountSort() -> It return sorted Array in the stable mannner by using count sort algorithm.
  public static void stableCountSort(int[] arr, int size) {
    int[] output = new int[size];
    int max = findMax(arr, size);
    int[] count = new int[max + 1];

    // Making a frequency array
    for (int i = 0; i < size; i++) {
      count[arr[i]]++;
    }

    // Making a prefix sum Array of count array for mainting the index of the count array.
    for (int i = 1; i < count.length; i++) {
      count[i] += count[i - 1];
    }

    // Finding the index of each element in the original Array and put it in output array.
    for (int i = size - 1; i >= 0; i--) {
      int idx = count[arr[i]] - 1;
      output[idx] = arr[i];
      count[arr[i]]--;
    }

    // Making copy all element of output to arr
    for (int i = 0; i < size; i++) {
      arr[i] = output[i];
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the element of the Array: ");
    inputArray(arr, size);
    System.out.print("Printing the element of the Array Before Sorting: ");
    printArray(arr, size);
    countSort(arr, size);
    System.out.print("After Sorting by the Unstable method: ");
    printArray(arr, size);
    stableCountSort(arr, size);
    System.out.print("After sorting by the Stable method: ");
    printArray(arr, size);
    sc.close();
  }
}
