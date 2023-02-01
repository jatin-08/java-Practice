// Find if the given array is sorted or not.

import java.util.*;

public class FindIsSorted {

  // Creating inputArray -> It takes input from the users.
  public static void inputArray(int[] arr) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a findIsSorted -> It return if the given array is sorted or not.
  public static boolean findIsSorted(int[] arr, int index) {
    if (index >= arr.length) {
      return false;
    }
    if (arr[index] <= arr[index + 1]) {
      return true;
    }
    return findIsSorted(arr, index + 1);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of the Array:" + " ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the element of the array:" + " ");
    inputArray(arr);
    if (findIsSorted(arr, 0)) {
      System.out.println("YES! It is Sorted");
    } else {
      System.out.println("NO! It is not Sorted");
    }
    sc.close();
  }
}
