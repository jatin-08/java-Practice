// Calculating the Transpose of a Matrix.

import java.util.*;

public class Transpose {

  // Creating a function printMultiArray for Printig the element of the 2D Array.

  public static void printMultiArray(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
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
      for (int j = i; j < rows; j++) { // for non square the vallue of j will starts from
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
    System.out.println("Tranpose of Matrix: ");
    transposeMatrix(arr, rows, cols);
    printMultiArray(arr);
  }
}
