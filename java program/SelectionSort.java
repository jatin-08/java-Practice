// Sorting the element of an array by using the SelectionSort.

import java.util.*;

public class SelectionSort {

  // Creating a inputArray -> It takes the value from the users
  public static void inputArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
  }

  // Creating a printArray -> It print the value from the Array.
  public static void printArray(int[] arr, int size) {
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Creating a selectionSort -> It Sort the element of the Array in increasing or decreasing order.
  // Time complexity -> T(n) = O(n^2) , T(n) = avg(n^2), T(n) = Best(n^2) and Space Complexity -> O(1).
  public static void selectionSort(int[] arr, int size) {
    if (size == 0) {
      System.out.println("Please provide the size of Array!");
      return;
    }
    for (int i = 0; i < size - 1; i++) {
      int min_idx = i;
      for (int j = i + 1; j < size; j++) {
        if (arr[j] < arr[min_idx]) {
          min_idx = j;
        }
        if (min_idx != i) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array: ");
    int size = sc.nextInt();
    System.out.print("Enter the element of the Array: ");
    int[] arr = new int[size];
    inputArray(arr, size);
    System.out.print("Element of the array before Sorting: ");
    printArray(arr, size);
    System.out.print("After Sorting: ");
    selectionSort(arr, size);
    printArray(arr, size);
  }
}
