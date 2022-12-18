// Given an matrix 'a', return all the element in sprial order.

import java.util.*;

public class SprialMatrix {

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

  // Creating a function sprialMatrix that print the matrix in the sprial order.

  public static void sprialMatrix(int arr[][], int rows, int cols) {
    int toprow = 0;
    int bottomrow = rows - 1;
    int rightcol = cols - 1;
    int leftcols = 0;
    int totalelement = 0;
    while (totalelement < rows * cols) {
      // toprow -> leftcols to rightcols
      for (int j = leftcols; j <= rightcol && totalelement < rows * cols; j++) {
        System.out.print(arr[toprow][j] + " ");
        totalelement++;
      }
      toprow++;
      // rightcol -> toprow to bottomrow
      for (int i = toprow; i <= bottomrow && totalelement < rows * cols; i++) {
        System.out.print(arr[i][rightcol] + " ");
        totalelement++;
      }
      rightcol--;
      // bottomrow -> rightcols to leftcols
      for (int j = rightcol; j >= leftcols && totalelement < rows * cols; j--) {
        System.out.print(arr[bottomrow][j] + " ");
        totalelement++;
      }
      bottomrow--;
      // leftcols -> bottomrow to toprow
      for (int i = bottomrow; i >= toprow && totalelement < rows * cols; i--) {
        System.out.print(arr[i][leftcols] + " ");
        totalelement++;
      }
      leftcols++;
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
    System.out.print("Spiral order Matrix: ");
    sprialMatrix(arr, rows, cols);
  }
}
