// Find the first peak element in the array {1,1,2,4,3,5,7,0}
// Peak element is the one which is greater than its immediate left and immediate right.

import java.util.*;

public class PeakElement {

  // Creating a function inputArray that take input from the user.
  public static void inputArray(int arr[]) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a function printArray it gives the all element of the array.
  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Creating a function peakElementArray it gives the 1st peak element from the array.
  public static void peakElementArray(int arr[]) {
    if (arr.length == 1) {
      System.out.println("The peak element of the array: " + arr[0]);
    }
    if (arr.length == 2) {
      if (arr[1] > arr[0]) {
        System.out.println("The Peak element of the array: " + arr[1]);
      } else {
        System.out.println("The peak element of the array: " + arr[0]);
      }
    }
    for (int i = 2; i < arr.length - 1; i++) {
      if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
        System.out.println("The peak element of the array: " + arr[i]);
        break;
      }
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of the Array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the values of the array: ");
    inputArray(arr);
    System.out.println("Printing the element of the array: ");
    printArray(arr);
    peakElementArray(arr);
    sc.close();
  }
}
