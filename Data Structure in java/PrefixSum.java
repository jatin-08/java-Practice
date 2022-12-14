// Given an integer array 'a', return the prefix sum/running sum in the same array without creating new array.
// arr = [2,1,3,5,4]
// prefix sum of arr = [2,3,6,11,15]

import java.util.*;

public class PrefixSum {

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
  }

  // Creating prefixSum function for find the prefix sum of the Array.
  public static int[] prefixSum(int[] arr, int size) {
    int[] prefix = new int[size];
    prefix[0] = arr[0]; // At 0 index both the prefix and arr array have same value
    for (int i = 1; i < size; i++) { // Now for i =1 we use for loop
      prefix[i] = prefix[i - 1] + arr[i];
    }
    return prefix;
  }

  // Creating pref function for find the prefix sum of the Array without using the External array.
  public static void pref(int[] arr, int size) {
    for (int i = 1; i < size; i++) { // Now for i =1 we use for loop
      arr[i] = arr[i - 1] + arr[i];
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Give input");
    inputArray(arr, size);
    System.out.println("Printing the element of Array!!");
    printArray(arr, size);
    int[] prefix = prefixSum(arr, size);
    System.out.print("The prefix sum of the array: ");
    printArray(prefix, size);
    System.out.print(
      "The prefix sum of the array without using the exteranl array: "
    );
    pref(arr, size);
    printArray(arr, size);
  }
}
