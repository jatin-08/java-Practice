// Check if we can partition the array into two subarrays with equal sum. More formally, check that the prefix sum of a part of a part of the array is equal to the suffix sum of rest of the array.

import java.util.*;

public class SubArrayEqualSum {

  // Printig the element of the Array

  public static void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  //Taking input from user

  public static void inputArray(int arr[], int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a function findArraySum that gives the sum of the array.

  public static int findArraySum(int[] arr, int size) {
    int totalSum = 0;
    for (int i = 0; i < size; i++) {
      totalSum += arr[i];
    }
    return totalSum;
  }

  // Creating a function equalSumPartition for comparing the prefixSum and Suffixsum.

  public static boolean equalSumPartition(int[] arr, int size) {
    int totalSum = findArraySum(arr, size);
    int prefixSum = 0;
    for (int i = 0; i < size; i++) {
      prefixSum += arr[i];
      int suffixsum = totalSum - prefixSum;
      if (suffixsum == prefixSum) {
        return true;
      }
    }
    return false;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Give input");
    inputArray(arr, size);
    System.out.print("Printing the element of Array: ");
    printArray(arr, size);
    System.out.print(
      "Equal partition possible : " + equalSumPartition(arr, size)
    );
    sc.close();
  }
}
