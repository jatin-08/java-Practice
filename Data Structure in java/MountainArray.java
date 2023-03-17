/* 
Given a mountain array 'a' of length greater than 3, return the index 'i' such that 
arr[0]<arr[1]<...<arr[i]>arr[i+1]..>arr[arr.length -1].this index known as the peak index.

input -> arr = [0,4,1,0]

output -> 1

*/

import java.util.*;

public class MountainArray {

  // Creating an inputArray() -> It takes input from the user
  public static void inputArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println();
    sc.close();
  }

  // Creating a printArray() -> It print the element of the Array.
  public static void printArray(int[] arr, int size) {
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + "");
    }
    System.out.println();
  }

  // Creating a peakIndex() -> It return the peak index of the Array.
  public static int peakIndex(int[] arr, int size) {
    int st = 0, end = size - 1;
    int ans = -1;
    while (st <= end) {
      int mid = st + (end - st) / 2;
      if (arr[mid] <= arr[mid + 1]) {
        st = mid + 1;
        ans = arr[mid + 1];
      } else {
        end = mid - 1;
      }
    }
    return ans;
  }

  // Creating a findPeakIndex() -> If it has mutliple peak then return the index of the of the peak element.
  public static int findPeakIndex(int[] arr) {
    int st = 0, end = arr.length - 1;
    while (st <= end) {
      int mid = st + (end - st) / 2;
      if (
        (mid == st || arr[mid] > arr[mid - 1]) &&
        (mid == end || arr[mid] > arr[mid + 1])
      ) {
        return mid;
      }
      if (arr[mid] < arr[mid + 1]) {
        st = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the element of the Array: ");
    inputArray(arr, size);
    System.out.print("Printing the element of the Array: ");
    printArray(arr, size);
    System.out.println(
      "The Peak element of the Array: " + peakIndex(arr, size)
    );
    System.out.println(
      "The One Peak element of the Array: " + findPeakIndex(arr)
    );
    sc.close();
  }
}
