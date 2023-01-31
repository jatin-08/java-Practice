// Calculating the Addition of Martix.

import java.util.*;

public class AdditionMatrix {

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
        sc.close();
      }
    }
  }

  // Creating a function addMatrix for addition of matrix

  public static void addMatrix(
    int arr1[][],
    int row1,
    int col1,
    int arr2[][],
    int row2,
    int col2
  ) {
    if (row1 != row2 || col1 != col2) {
      System.out.print("Wrong input! The addition is not possible!");
      return;
    }

    int sum[][] = new int[row1][col1];

    for (int i = 0; i < row1; i++) { // row number
      for (int j = 0; j < col1; j++) { // col number
        sum[i][j] = arr1[i][j] + arr2[i][j];
      }
    }
    printMultiArray(sum, row1, col1);
  }

  // Creating a function subMatrix for Substraction of matrix

  public static void subMatrix(
    int arr1[][],
    int row1,
    int col1,
    int arr2[][],
    int row2,
    int col2
  ) {
    if (row1 != row2 || col1 != col2) {
      System.out.print("Wrong input! The Subtraction is not possible!");
      return;
    }

    int sub[][] = new int[row1][col1];

    for (int i = 0; i < row1; i++) { // row number
      for (int j = 0; j < col1; j++) { // col number
        sub[i][j] = arr1[i][j] - arr2[i][j];
      }
    }
    printMultiArray(sub, row1, col1);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Rows For 1st Matrix : ");
    int row1 = sc.nextInt();
    System.out.print("Enter the Cols For 1st Matrix : ");
    int col1 = sc.nextInt();
    int arr1[][] = new int[row1][col1];
    System.out.println("Taking input for 1st Matrix : ");
    inputMultiArray(arr1, row1, col1);
    System.out.print("Enter the Rows For 2nd Matrix : ");
    int row2 = sc.nextInt();
    System.out.print("Enter the Cols For 2nd Matrix : ");
    int col2 = sc.nextInt();
    int arr2[][] = new int[row2][col2];
    System.out.println("Taking input For 2nd Matrix : ");
    inputMultiArray(arr2, row2, col2);
    System.out.println("Printing the 1st Matrix:");
    printMultiArray(arr1, row1, col1);
    System.out.println("Printing the 2nd Matrix:");
    printMultiArray(arr2, row2, col2);
    System.out.println("Sum of Matrix: ");
    addMatrix(arr1, row1, col1, arr2, row2, col2);
    System.out.println("Subraction of Matrix: ");
    subMatrix(arr1, row1, col1, arr2, row2, col2);
    sc.close();
  }
}
