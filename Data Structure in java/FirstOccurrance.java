/*
Find the first occurrance of a given element x, given that the array is sorted. If no occurrance of x found then return -1.

input -> [2,3,4,5,6,7,8]
x -> 4
output -> 1

 */

import java.util.*;

public class FirstOccurrance {

  // Creating an inputArray() -> It takes input from the users.
  public static void inputArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a printArray() -> It print the element of the Array.
  public static void printArray(int arr[], int size) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  // Creating a firstOccurrance() -> It return first occurrance of the element which has been searched.
  public static int firstOccurrance(int[] arr, int size, int target) {
    int st = 0, end = size - 1, fo = -1;
    while (st <= end) {
      int mid = st + (end - st) / 2;
      if (target == arr[mid]) {
        fo = mid;
        end = mid - 1;
      } else if (target < arr[mid]) {
        end = mid - 1;
      } else {
        st = mid + 1;
      }
    }
    return fo;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Sorted Array: ");
    int size = sc.nextInt();
    System.out.print("Enter the target value: ");
    int target = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the element of the Array in the sorted order: ");
    inputArray(arr, size);
    System.out.print("Printing the element of the Array: ");
    printArray(arr, size);
    System.out.print(
      "The First occurrance of " +
      target +
      " : " +
      firstOccurrance(arr, size, target)
    );
    sc.close();
  }
}
