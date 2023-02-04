// Given an array arr[] of size n. The task is to find the sum of the contiguous subarray within a arr[] with the largest sum.

import java.util.*;

public class LargestSumOfSubArray {

  // Creating a inputArray() -> It takes input from the user
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

  // Creating a findLargestSumOfSubArray() -> It return the largest sum subArray.
  public static int findLargestSumOfSubArray(int[] arr, int size) {
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for (int i = 0; i < size; i++) {
      sum += arr[i];
      if (max < sum) {
        max = sum;
      }
      if (max < 0) {
        sum = 0;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = sc.nextInt();
    System.out.print("Enter the element of the Array: ");
    int[] arr = new int[size];
    inputArray(arr, size);
    System.out.println("Printing the element of the Array: ");
    printArray(arr, size);
    System.out.println(
      "The largest sum of Sub Array: " + findLargestSumOfSubArray(arr, size)
    );
    sc.close();
  }
}
