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

  // Creating a rotateArray() -> It retuns the Rotated Array.
  public static int[] rotateArray(int[] arr, int size, int key) {
    key = key % size;
    int[] ans = new int[size];
    int j = 0;
    // For the rotation of the Array
    for (int i = size - key; i < size; i++) {
      ans[j++] = arr[i];
    }

    // For the remaing element in the array.
    for (int i = 0; i < size - key; i++) {
      ans[j++] = arr[i];
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array: ");
    int size = sc.nextInt();
    System.out.print("Enter the key value: ");
    int key = sc.nextInt();
    System.out.print("Enter the element you want to search: ");
    int search = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the element of the Array: ");
    inputArray(arr, size);
    System.out.print("Printing the element of the Array: ");
    printArray(arr, size);
    int[] ans = rotateArray(arr, size, key);
    System.out.print("Printing the rotated Array from " + key + " : ");
    printArray(ans, size);
    for (int i = 0; i < size; i++) {
      if (search == ans[i]) {
        System.out.println("Element found at " + i);
      }
    }
    sc.close();
  }
}
