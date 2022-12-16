// Creating a MultidimensionArray and printing its element.

import java.util.*;

public class MultiArray {

  // Creating a function printMultiArray for Printig the element of the 2D Array.

  public static void printMultiArray(int arr[][], int rows, int cols) {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  // Creating a function inputMultiArray for Taking input from user in the 2D Array.

  public static void inputMultiArray(int arr[][], int rows, int cols) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
  }

  // Creating a function reverse Multiarray that reverse the rows.

  public static void reverseRow(int arr[][], int rows, int cols) {
    for (int i = 0; i < rows; i++) {
      int start = 0; // at this steps it reset the start value and initialise it with 0
      int last = cols - 1; // at this step it reset the last value and initialise it with cols - 1.
      while (start < last) {
        int temp = arr[i][start];
        arr[i][start] = arr[i][last];
        arr[i][last] = temp;
        start++;
        last--;
      }
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Rows of Array : ");
    int rows = sc.nextInt();
    System.out.print("Enter the Cols of Array : ");
    int cols = sc.nextInt();
    int arr[][] = new int[rows][cols];
    System.out.println("Taking input from user : ");
    inputMultiArray(arr, rows, cols);
    System.out.println("Printing the element of Array!!");
    printMultiArray(arr, rows, cols);
    System.out.println("Reversing the Row of the 2D array:");
    reverseRow(arr, rows, cols);
    printMultiArray(arr, rows, cols);
  }
}
