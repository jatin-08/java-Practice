// Sort an Array consisting of only 0s and 1s

import java.util.*;

public class Sort01 {

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

  // Creating a sortZeroOne function that sort the array in increasing order

  public static void sortZeroOne(int[] arr) {
    int zero = 0;

    // 1st we traverse the whole array. And store the record of Zero occurance in the array by zero variable.
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        zero++;
      }
    }

    // Now we array sorting the Array.
    for (int i = 0; i < arr.length; i++) {
      if (i < zero) {
        arr[i] = 0;
      } else {
        arr[i] = 1;
      }
    }
  }

  // Creating a swapArray function that is used for swaping the element of Array

  public static void swapArray(int[] arr, int start, int last) {
    while (start < last) {
      int temp = arr[start];
      arr[start] = arr[last];
      arr[last] = temp;
      start++;
      last--;
    }
  }

  // 2nd approach :  Creating a sortZero2One function that sort the array in increasing order

  public static void sortZero2One(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
      if (arr[left] == 1 && arr[right] == 0) {
        swapArray(arr, left, right);
      } else {
        left++;
        right--;
      }
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
    sortZeroOne(arr);
    System.out.print("Sorted Array: ");
    printArray(arr, size);
    sortZero2One(arr);
    System.out.print("Sorted Array by 2nd Approach: ");
    printArray(arr, size);
  }
}
