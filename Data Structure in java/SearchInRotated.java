// Searching of element in the Rotated Array

import java.util.*;

public class SearchInRotated {

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
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Creating a reverseArray() -> It return the reversed array.
  public static void reverseArray(int[] arr, int size, int start, int last) {
    while (start < last) {
      int temp = arr[start];
      arr[start] = arr[last];
      arr[last] = temp;
      start++;
      last--;
    }
  }

  // Creating a rotatedArray() -> It return the rotated array.
  public static void rotatedArray(int arr[], int size, int rotatepoint) {
    reverseArray(arr, size, 0, size - rotatepoint - 1); // Reverse 1st half
    reverseArray(arr, size, size - rotatepoint, size - 1); // Reverse 2nd half
    reverseArray(arr, size, 0, size - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array: ");
    int size = sc.nextInt();
    System.out.print("Enter the element of Array: ");
    int[] arr = new int[size];
    inputArray(arr, size);
    System.out.print("Printing the element of the Array Before Rotated: ");
    printArray(arr, size);
    System.out.print("Printing the Array after rotation: ");
    rotatedArray(arr, size, 3);
    printArray(arr, size);
    sc.close();
  }
}
