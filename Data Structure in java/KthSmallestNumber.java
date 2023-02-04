// Find the kth smallest Number from the given array.{7,10,2,3,20,15}

import java.util.*;

public class KthSmallestNumber {

  // Creating a function inputArray for taking input from the user.

  public static void inputArray(int arr[]) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a function printArray that print element of the array.
  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the element of Array: ");
    inputArray(arr);
    System.out.print("Printing the Array: ");
    printArray(arr);
    System.out.print("Enter the kth value: ");
    int k = sc.nextInt();
    System.out.println("The Sorted Array: ");
    Arrays.sort(arr);
    printArray(arr);
    System.out.println("The " + k + " smallest Number: " + arr[k - 1]);
    sc.close();
  }
}
