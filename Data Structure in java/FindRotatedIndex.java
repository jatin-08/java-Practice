/* 
Write a program to return the rotated index.Given a rotated sorted array.

input -> [3,4,5,1,2]
output -> 3

*/

import java.util.*;

public class FindRotatedIndex {

  // Creating an inputArray()  -> It takes input from the user
  public static void inputArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a printArray() -> It print the element of the Array.
  public static void printArray(int[] arr, int size) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  // Creating a findRotatedIndex() -> It return the rotated point from where the array is rotated.
  public static int findRotatedIndex(int[] arr, int size) {
    int st = 0, end = size - 1, ans = -1;
    while (st <= end) {
      int mid = st + (end - st) / 2;
      if (arr[mid] <= arr[size - 1]) {
        ans = mid;
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
    int[] arr = new int[size];
    System.out.print("Enter the element in rotated sorted array: ");
    inputArray(arr, size);
    System.out.print("Printing the element of the rotated sorted Array: ");
    printArray(arr, size);
    System.out.println(
      "Rotated Point of the given sorted Array is " +
      findRotatedIndex(arr, size)
    );
    sc.close();
  }
}
