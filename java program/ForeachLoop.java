//  Traverse over the elements of the array using for each loop and print all the even number.

import java.util.*;

public class ForeachLoop {

  //  Creating a function printEven for printing the Even Number of the array.
  public static void printEven(int[] arr) {
    // Syntax of for each loop in java
    for (int val : arr) {
      if (val % 2 == 0) {
        System.out.println("The Even Number from the given Arrays are :" + val);
      }
    }
  }

  //  Creating a function ScanArray for Taking input from the user
  public static void scanArray(int arr[]) {
    Scanner sc = new Scanner(System.in);

    // Syntax of for each loop in java
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int size = sc.nextInt();
    System.out.print("Enter the Element of Array : ");
    int[] arr = new int[size];
    scanArray(arr);
    printEven(arr);
  }
}
