// Finding the Second largest element from the given Array .

import java.util.*;

public class SecondLargest {

  // Creating a function for taking input

  public static void inputArray(int arr[], int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
  }

  // Creating a function for finding the 2nd largest number from the given Array.

  static void print2largest(int arr[], int size) {
    int first, second, i;
    if (size < 2) {
      System.out.print("Invalid Input !!!");
    }
    int largest = second = Integer.MIN_VALUE;

    // for finding the largest number

    for (i = 0; i < size; i++) {
      largest = Math.max(largest, arr[i]);
    }

    // Finding the 2nd largest Number

    for (i = 0; i < size; i++) {
      if (arr[i] != largest) {
        second = Math.max(second, arr[i]);
      }
    }
    if (second == Integer.MIN_VALUE) {
      System.out.println(
        "There is no 2nd largest number in the given Array!!!"
      );
    } else {
      System.out.printf(
        "\n The 2nd largest Number in the given Array is %d",
        second
      );
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the element of Array : ");
    inputArray(arr, size);
    print2largest(arr, size);
  }
}
