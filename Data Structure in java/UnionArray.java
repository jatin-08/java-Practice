// Calculating the Union between 2 Array.
// Union set -> print the distinct element from both the array.

import java.util.*;

public class UnionArray {

  // Creating a function inputArray for taking input from the user.

  public static void inputArray(int arr[]) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
  }

  // Creating a function printArray that print element of the array.
  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Creating function unionArray it gives the Union between the two Array.
  public static void unionArray(int arr1[], int arr2[]) {
    for (int i = 0; i < arr1.length; i++) {
      boolean check = false;
      for (int j = 0; j < arr2.length; j++) {
        if (arr1[i] == arr2[j]) {
          check = true;
          break;
        }
      }
      if (!check) {
        System.out.print(
          "The Union element of the given two array: " + arr1[i]
        );
      }
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of 1st Array : ");
    int size1 = sc.nextInt();
    System.out.print("Enter the size of the 2nd Array: ");
    int size2 = sc.nextInt();
    int arr1[] = new int[size1];
    int arr2[] = new int[size2];
    System.out.print("Enter the element of 1st Array : ");
    inputArray(arr1);
    System.out.print("Enter the element of 2nd Array: ");
    inputArray(arr2);
    System.out.print("Printing the 1st Array: ");
    printArray(arr1);
    System.out.print("Printing the 2nd Array: ");
    printArray(arr2);
    unionArray(arr1, arr2);
  }
}
