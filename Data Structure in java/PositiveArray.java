// Given an array of integer, print only the positive value of the given array.

import java.util.*;

public class PositiveArray {

  // Creating a function inputArray that take input from the user.
  public static void inputArray(int arr[]) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a function printPositiveArray it gives the positive element of the array.
  public static void printPositiveArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= 0) {
        System.out.print(arr[i] + " ");
      }
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of the Array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the values of the array: ");
    inputArray(arr);
    System.out.print("Printing the positive number of the array: ");
    printPositiveArray(arr);
    sc.close();
  }
}
