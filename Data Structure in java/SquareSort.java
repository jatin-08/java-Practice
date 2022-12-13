// Given an array of integers 'a', sorted in non-decreasing order, return an array of the Square of each number sorted in non-decreasing order.

import java.util.*;

public class SquareSort {

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

  // Creating a sortSquare function that return the square of the element of array in non-decreasing form.
  public static int[] sortSquare(int[] arr, int size) {
    int left = 0;
    int right = size - 1;
    int k = 0;
    int[] ans = new int[size];
    while (left <= right) {
      if (Math.abs(arr[left]) > Math.abs(arr[right])) {
        ans[k++] = arr[left] * arr[left];
        left++;
      } else {
        ans[k++] = arr[right] * arr[right];
        right--;
      }
    }
    return ans;
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
    int[] ans = sortSquare(arr, size);
    System.out.print("Sorted Array: ");
    swapArray(ans, 0, size - 1);
    printArray(ans, size);
  }
}
