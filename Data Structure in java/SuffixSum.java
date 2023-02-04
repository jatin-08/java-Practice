// Given an integer array 'a', return the Suffix sum/back running sum in the same array without creating new array.
// arr = [2,5,6,1,3]
// prefix sum of arr = [17,15,10,4,3]

import java.util.*;

public class SuffixSum {

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

  // Creating prefixSum function for find the prefix sum of the Array.
  public static int[] suffixSum(int[] arr, int size) {
    int[] suffix = new int[size];
    suffix[size - 1] = arr[size - 1]; // At 0 index both the prefix and arr array have same value
    for (int i = size - 2; i >= 0; i--) { // Now for i =1 we use for loop
      suffix[i] = suffix[i + 1] + arr[i];
    }
    return suffix;
  }

  // Creating pref function for find the prefix sum of the Array without using the External array.
  public static void suf(int[] arr, int size) {
    for (int i = size - 2; i >= 0; i--) { // Now for i =1 we use for loop
      arr[i] = arr[i + 1] + arr[i];
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
    int[] suffix = suffixSum(arr, size);
    System.out.print("The Suffix sum of the array: ");
    printArray(suffix, size);
    System.out.print(
      "The Suffix sum of the array without using the exteranl array: "
    );
    suf(arr, size);
    printArray(arr, size);
    sc.close();
  }
}
