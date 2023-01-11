// 1. Printing the element of the Array by using the Recursion.
// 2. Finding the max element of the Array using Recursion.
// 3. Finding the sum of element of the Array using Recursion.

import java.util.*;

public class ArrayByRecursion {

  // Creating a inputArray-> It takes input from the user.
  public static void inputArray(int[] arr) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
  }

  // Creating a printArray -> It print the element of the array.
  public static void printArray(int[] arr, int index) {
    if (index == arr.length) { // Base case
      return;
    }
    // Self work
    System.out.print(arr[index] + " ");
    // recursive work / small problem
    printArray(arr, index + 1);
  }

  // Creatting a maxelement -> it return the max element from the Array. Time And Space complexity -> O(n).
  public static int maxelement(int[] arr, int index) {
    if (index == arr.length - 1) { // Base Case
      return arr[index];
    }
    // small problem
    int ans = maxelement(arr, index + 1);
    // self work
    return Math.max(arr[index], ans);
  }

  // Creating a sumOfElement -> It return the sum of element of the Array.
  public static int sumOfElement(int[] arr, int index) {
    if (index == arr.length) { // Base Case
      return 0;
    }
    int ans = sumOfElement(arr, index + 1); // small problem
    return (arr[index] + ans); // self work
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the element of Array: ");
    inputArray(arr);
    System.out.print("Printing the element of the Array: ");
    printArray(arr, 0);
    System.out.println();
    System.out.println("The Max element from the Array: " + maxelement(arr, 0));
    System.out.println(
      "The sum of the element of the Array: " + sumOfElement(arr, 0)
    );
  }
}
