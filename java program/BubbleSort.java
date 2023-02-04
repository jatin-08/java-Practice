// Sorting the element of an array by using the bubbleSort.

import java.util.*;

public class BubbleSort {

  // Creating a inputArray -> It takes the value from the users
  public static void inputArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a printArray -> It print the value from the Array.
  public static void printArray(int[] arr, int size) {
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Creating a bubbleSort -> It Sort the element of the Array in increasing or decreasing order.
  // Time complexity -> T(n) = O(n^2) , T(n) = avg(n^2), T(n) = Best(n) and Space Complexity -> O(1).
  public static void bubbleSort(int[] arr, int size) {
    if (size == 0) {
      System.out.println("Please provide the size of Array!");
      return;
    }
    boolean flag = false;
    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          flag = true;
        }
      }
      if (!flag) {
        return;
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
    bubbleSort(arr, size);
    printArray(arr, size);
    sc.close();
  }
}
