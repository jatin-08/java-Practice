/* 
write a program that check in the rotated array that the element are present or not.Given that the Array is sorted and has unique element.

input -> [3,4,5,1,2] target = 5
output -> 2

*/

import java.util.*;

public class FindElementInRotatedArray {

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

  // Creating a searchInRotatedArray() -> It return the index of element if it is present in the rotated sorted Array.
  //  public static int searchInRotatedArray(int[] arr, int size, int target) {
  //     int st = 0, end = size - 1;
  //     while (st <= end) {
  //       int mid = st + (end - st) / 2;
  //       if (arr[mid] == target) {
  //         return mid;
  //       } else if (arr[mid] < arr[end]) { // mid to end will be sorted if it true.
  //         if (target > arr[mid] && target <= arr[end]) {
  //           st = mid + 1;
  //         } else {
  //           end = mid - 1;
  //         }
  //       } else {
  //         if (target >= arr[st] && target < arr[mid]) {
  //           end = mid - 1;
  //         } else {
  //           st = mid + 1;
  //         }
  //       }
  //     }
  //     return -1;
  //   }

  // Creating a searchDuplicate() -> It will work for if the Array having duplicate element.
  public static int searchDuplicate(int[] arr, int size, int target) {
    int st = 0, end = size - 1;
    while (st <= end) {
      int mid = st + (end - st) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[st] == arr[mid] && arr[mid] == arr[end]) {
        st++;
        end--;
      } else if (arr[mid] <= arr[end]) { // mid to end will be sorted if it true.
        if (target > arr[mid] && target <= arr[end]) {
          st = mid + 1;
        } else {
          end = mid - 1;
        }
      } else {
        if (target >= arr[st] && target < arr[mid]) {
          end = mid - 1;
        } else {
          st = mid + 1;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array: ");
    int size = sc.nextInt();
    System.out.print("Enter the target value: ");
    int target = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the element in rotated sorted array: ");
    inputArray(arr, size);
    System.out.print("Printing the element of the rotated sorted Array: ");
    printArray(arr, size);
    System.out.print(
      "The " + target + " found at index " + searchDuplicate(arr, size, target)
    );
    sc.close();
  }
}
