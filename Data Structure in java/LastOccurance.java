/* 
Write a program to search the last occurrance of the element in the Array using Binary Search algorithm.

input -> [1,1,1,2,2] target = 1
output -> 2

*/

import java.util.*;

public class LastOccurance {

  // Creating an inputArray() -> It takes input from the user.
  public static void inputArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a printArray() -> It print the element in the Array.
  public static void printArray(int[] arr, int size) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  // Creating a searchLastOccurrance() -> It return last occurrance of the element to be search.
  public static int searchLastOccurrance(int[] arr, int size, int target) {
    int st = 0, end = size - 1, ans = -1;
    while (st <= end) {
      int mid = st + (end - st) / 2; // find mid
      if (target == arr[mid]) {
        st = mid + 1; // It mean all the element are lesser. So, we have to search at the right side
        ans = mid; // update ans to mid.
      } else if (target < arr[mid]) {
        end = mid - 1;
      } else {
        st = mid + 1;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array: ");
    int size = sc.nextInt();
    System.out.print("Enter the target value: ");
    int target = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the element of the array in the Sorted order: ");
    inputArray(arr, size);
    System.out.print("Printing the element of the Array: ");
    printArray(arr, size);
    System.out.print(
      "The " +
      target +
      " found at index " +
      searchLastOccurrance(arr, size, target)
    );
    sc.close();
  }
}
