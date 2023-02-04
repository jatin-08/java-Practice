// INSERTION SORT ALGORITHM

import java.util.*;

public class InsertionSort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the element of the Array: ");
    inputArray(arr, size);
    System.out.print("Before Sorting: ");
    printArray(arr, size);
    System.out.print("After Sorting: ");
    insertionSort(arr, size);
    printArray(arr, size);
    sc.close();
  }

  // Creating an inputArray() -> It takes input from the user.
  public static void inputArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println();
    sc.close();
  }

  // Creating a printArray() -> It print the element of the Array.
  public static void printArray(int[] arr, int size) {
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Creating an insertionSort() -> It sort the given array in increasing order.
  public static void insertionSort(int[] arr, int size) {
    for (int i = 1; i < size; i++) {
      int j = i;
      while (j > 0 && arr[j] < arr[j - 1]) {
        // Swap
        int temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
        j--;
      }
    }
    System.out.println();
  }
}
