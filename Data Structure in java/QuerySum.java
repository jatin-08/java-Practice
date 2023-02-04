// Given an array of integer of size n. Answer q queries where you need to print the sum of value in a given range of indices from 1 or r.
// Note: The value of 1 and r in queries follow 1-based indexing.

import java.util.*;

public class QuerySum {

  // Printig the element of the Array

  public static void printArray(int arr[], int size) {
    for (int i = 1; i <= size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  //Taking input from user

  public static void inputArray(int arr[], int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 1; i <= size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating pref function for find the prefix sum of the Array without using the External array.
  public static int[] pref(int[] arr, int size) {
    for (int i = 1; i <= size; i++) { // Now for i =1 we use for loop
      arr[i] = arr[i - 1] + arr[i];
    }
    return arr;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int size = sc.nextInt();
    int arr[] = new int[size + 1];
    System.out.print("Give input: ");
    inputArray(arr, size);
    System.out.print("The Array: ");
    printArray(arr, size);
    int[] result = pref(arr, size);
    System.out.print("Enter no. of Queries: ");
    int queries = sc.nextInt();

    // Finding the sum by using prefix sum function

    while (queries-- > 0) {
      System.out.print("Enter range: ");
      int l = sc.nextInt();
      int r = sc.nextInt();

      int ans = result[r] - result[l - 1];
      System.out.println("Sum " + ans);
      sc.close();
    }
  }
}
