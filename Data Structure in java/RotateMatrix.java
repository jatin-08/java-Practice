// Given a square matrix , turn it by 90 degree in a clockwise direction without using any extra space.

import java.util.*;

public class RotateMatrix {

  // Creating a function printMultiArray for Printig the element of the 2D Array.

  public static void printMultiArray(int arr[][]) {
    for (int i = 0; i < arr.length; i++) { // Taking value of row.
      for (int j = 0; j < arr[i].length; j++) { // Taking value of col.
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

  //  Creating a function transposeMatrix that transpose our given matrix.

  public static void transposeMatrix(int arr[][], int rows, int cols) {
    for (int i = 0; i < cols; i++) {
      for (int j = i; j < rows; j++) { // for non square the vallue of j will starts from 0.
        // it is for square matrix.
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
        /*

        for non square matrix and also applied on square matrix.
        system.out.print(arr[j][i]+" ");
        
        */
      }
      // System.out.println();

    }
  }

  // Creating a function reverse Multiarray that reverse the rows.

  public static void reverseRow(int arr[][], int rows, int cols) {
    for (int i = 0; i < rows; i++) {
      int start = 0; // at this steps it reset the start value and initialise it with 0.And start pointing to cols at 0 index.
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

  // Creating a function rotateMatrix that rotate the matrix to 90 degree.
  public static void rotateMatrix(int arr[][], int rows, int cols) {
    // 1st step: Transpose a given matrix.
    transposeMatrix(arr, rows, cols);
    // 2nd step: Reverse the rows of the matrix.
    reverseRow(arr, rows, cols);
  }

  // it is the main function.

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
    printMultiArray(arr);
    System.out.println("Rotated Matrix about 90 degree: ");
    rotateMatrix(arr, rows, cols);
    printMultiArray(arr);
  }
}
