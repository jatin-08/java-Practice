// Traverse over the element of the array {1,2,3,4,,5,6,7,8} Using foreach loop and print all even element.

import java.util.*;

public class EvenArray {

  // Creating a function inputArray that take input from the user.
  public static void inputArray(int arr[]) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a function printEvenArray it gives the Even element of the array.
  public static void printEvenArray(int arr[], int size) {
    // For each Loop
    for (int i : arr) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
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
    System.out.print("Printing the Even element of the array: ");
    printEvenArray(arr, size);
    sc.close();
  }
}
