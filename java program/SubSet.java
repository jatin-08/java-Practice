// Given an array of integers, print sums of all subsets in it. Output sums can be printed in any order.

import java.util.*;

public class SubSet {

  // Creating a inputArray -> It takes input from the user.
  public static void inputArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i <= size - 1; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a subSetSum -> It print the sum of the subset.
  public static void subSetSum(int[] arr, int size, int idx, int sum) {
    // Base Case
    if (idx >= size) {
      System.out.print(sum + " ");
      return;
    }
    subSetSum(arr, size, idx + 1, sum + arr[idx]); // include the current index.
    subSetSum(arr, size, idx + 1, sum); // do not include the current index.
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array: ");
    int size = sc.nextInt();
    System.out.print("Enter the element of the Array: ");
    int[] arr = new int[size];
    inputArray(arr, size);
    System.out.print("Printing the SubSetSum of the given subset: ");
    subSetSum(arr, size, 0, 0);
    sc.close();
  }
}
