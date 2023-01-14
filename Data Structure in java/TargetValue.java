// Given an array of integer n and target value x. Print if the target value is exist or not.

import java.util.*;

public class TargetValue {

  // Creating a inputArray-> It takes input from the user.
  public static void inputArray(int[] arr) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
  }

  // Creating a valueExist -> It return 'yes' if value is present otherwise it return 'No' not present.
  public static boolean valueExist(int[] arr, int index, int val) {
    if (index >= arr.length) { // Base Case
      return false;
    }
    // Self work
    if (arr[index] == val) {
      return true;
    }
    // Recursive work
    return valueExist(arr, index + 1, val);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the element of Array: ");
    inputArray(arr);
    System.out.print("Enter the value you want to know it exist or not: ");
    int val = sc.nextInt();
    if (valueExist(arr, 0, val)) {
      System.out.print("YES! IT EXIST.");
    } else {
      System.out.print("NO! IT DOESNOT EXIST.");
    }
  }
}
