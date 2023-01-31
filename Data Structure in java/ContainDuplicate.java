/*  Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

input -> arr = [1,2,3,1]

output -> true.

*/

import java.util.*;

public class ContainDuplicate {

  // Creating an inputArray() -> It takes input from the user.
  public static void inputArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a containDuplicate() -> It will give true if Duplicate values are present in the array otherwise it return false.
  public static boolean containDuplicate(int[] arr, int size) {
    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        if (arr[j] == arr[i]) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array: ");
    int size = sc.nextInt();
    System.out.println("Enter the value of the Array: ");
    int[] arr = new int[size];
    inputArray(arr, size);
    if (containDuplicate(arr, size)) {
      System.out.println("Yes the Array have Duplicate Values!");
    } else {
      System.out.println("No the Array does not have Duplicate Values!");
    }
    sc.close();
  }
}
