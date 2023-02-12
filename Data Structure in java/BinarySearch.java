// Implementing the Binary Search Algorithm. It can be implemented on the sorted Array.

import java.util.*;

public class BinarySearch {

  // Creating an inputArray() -> It takes input from the users.
  public static void inputArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a printArray() -> It print the element of the Array.
  public static void printArray(int arr[], int size) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  // Creating a binarySearch() -> It search the target value is present in the sorted Array or not.
  // Time complexity -> T(n) = O(log n). Space complexity -> S(n) = O(1).
  public static boolean binarySearch(int[] arr, int size, int target) {
    int st = 0, end = size - 1;
    while (st <= end) {
      int mid = st + (end - st) / 2; // to prevent from integer overflow
      if (target == arr[mid]) {
        return true;
      } else if (target < arr[mid]) {
        end = mid - 1;
      } else {
        st = mid + 1;
      }
    }
    return false;
  }

  // Creating a recBinarySearch() -> It search the target using recursion.
  // Time complexity -> T(n) = O(log n). Space complexity -> S(n) = O(log n)
  public static boolean recBinarySearch(
    int[] arr,
    int size,
    int st,
    int end,
    int target
  ) {
    // Base case
    if (st <= end) {
      int mid = st + (end - st) / 2; // to prevent from the overflow condition
      if (target == arr[mid]) { // Self work
        return true;
      } else if (target < arr[mid]) {
        recBinarySearch(arr, size, st, mid - 1, target); // Recursive work
      } else {
        recBinarySearch(arr, size, mid + 1, end, target); // Recursive work
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Sorted Array: ");
    int size = sc.nextInt();
    System.out.print("Enter the target value: ");
    int target = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the element of the Array in the sorted order: ");
    inputArray(arr, size);
    System.out.print("Printing the element of the Array: ");
    printArray(arr, size);
    System.out.println(
      "If true then number is present otherwise false: " +
      binarySearch(arr, size, target)
    );
    System.out.println(
      "If true then number is present otherwise false By Recursion: " +
      recBinarySearch(arr, size, 0, size - 1, target)
    );
    sc.close();
  }
}
