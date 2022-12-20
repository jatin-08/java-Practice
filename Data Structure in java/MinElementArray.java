// Calculate the minimum element in the array {2,-3,5,8,1,0,-4} using standard library method for calculating the minimum element.

import java.util.*;

public class MinElementArray {

  // Creating a function inputArray that take input from the user.
  public static void inputArray(int arr[]) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
  }

  // Creating a function printArray it gives the all element of the array.
  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Creating a function minElementArray it gives the minimum element from the array.
  public static int minElementArray(int arr[]) {
    int x = arr[0];
    if (arr.length == 1) {
      return x;
    }
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i - 1] && x > arr[i]) {
        x = arr[i];
      }
    }

    return x;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of the Array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the values of the array: ");
    inputArray(arr);
    System.out.println("Printing the element of the array: ");
    printArray(arr);
    System.out.println(
      "The minimum element of the Array: " + minElementArray(arr)
    );
  }
}
