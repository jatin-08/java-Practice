// Write a program to search in Rotated Array.

import java.util.*;

public class SearchInRotatedArray {

  // Creating an inputArray() -> It takes input from the user.
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

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the element of the Array: ");
    inputArray(arr, size);
    System.out.print("Printing the element of the Array: ");
    printArray(arr, size);
    sc.close();
  }
}
