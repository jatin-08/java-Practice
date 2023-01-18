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

  // Creating a findIndex -> It return the find index of the element if target present in the array, otherwise it return -1.
  public static int findIndex(int[] arr, int index, int val) {
    if (index >= arr.length) { // Base Case
      return -1;
    }
    // Self work
    if (arr[index] == val) {
      return index;
    }
    // Recursive work
    return findIndex(arr, index + 1, val);
  }

  // Creating a findLastIndex -> It return the last index of the element if target present in the array, otherwise it return -1.
  public static int findLastIndex(int[] arr, int index, int val) {
    if (index >= arr.length) {
      return -1;
    }
    int lastindex = findLastIndex(arr, index + 1, val);
    if (arr[index] == val && index > lastindex) {
      return index;
    } else {
      return lastindex;
    }
  }

  // Creating a findAllIndex -> It return all the index of the element if target present in the array.
  public static void findAllIndex(int[] arr, int index, int val) {
    if (index >= arr.length) { // Base Case
      return;
    }
    // Self work
    if (arr[index] == val) {
      System.out.print(index + " ");
    }
    findAllIndex(arr, index + 1, val);
  }

  // Creating allIndex -> It return all the index of the element if target present in the array in form of Array List.\
  public static ArrayList<Integer> allIndex(int[] arr, int index, int val) {
    // Base Case
    if (index >= arr.length) {
      return new ArrayList<Integer>(); // it return empty arraylist.
    }
    ArrayList<Integer> ans = new ArrayList<Integer>();
    // Self Work
    if (arr[index] == val) {
      ans.add(index); // it add the index in the ans.
    }
    // Recursive work
    ArrayList<Integer> smallans = allIndex(arr, index + 1, val);
    ans.addAll(smallans);
    return ans;
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
      System.out.println("YES! IT EXIST.");
    } else {
      System.out.println("NO! IT DOESNOT EXIST.");
    }
    System.out.println(
      "The first index where target found " + findIndex(arr, 0, val)
    );
    System.out.print("The all index where target are present ");
    findAllIndex(arr, 0, val);
    System.out.println();
    ArrayList<Integer> ans = allIndex(arr, 0, val);
    for (Integer i : ans) {
      System.out.println("The Target found in ArrayList " + i);
    }
    System.out.println(
      "The target found at last index " + findLastIndex(arr, 0, val)
    );
  }
}
