// Given an array of integers 'a', move all the even integers at the beginning of the array followed by all the odd integers. The relative order don't matter.

import java.util.*;

public class EvenSort {

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

  // Creating a sortBy2Parity function sort the even no. in starting and odd no. in end.

  public static void sortByParity(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
      if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
        swapArray(arr, left, right);
        left++;
        right--;
      }
      if (arr[left] % 2 == 0) {
        left++;
      }
      if (arr[right] % 2 == 1) {
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
    sortByParity(arr);
    System.out.print("Sorted Array: ");
    printArray(arr, size);
  }
}
