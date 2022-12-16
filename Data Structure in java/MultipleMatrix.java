// Calculating the Multiplication of Matrix.

import java.util.*;

public class MultipleMatrix {

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

    // Creating a function multipleMatrix for Multiplication of matrix

  public static void multiMatrix(int arr1[][], int row1, int col1, int arr2[][], int row2, int col2){
    if(col1 != row2){
        System.out.print("Wrong Deminsion! The Multiplication is not possible!");
        return;
    }

    int mul[][] = new int[row1][col2];

    for(int i = 0; i < row1; i++){  // row number
        for(int j= 0; j < col2; j++){ // col number
         for(int k = 0; k < row2; k++){ // for calculating the multiplication
            mul[i][j] += arr1[i][k] * arr2[k][j];
         }
        }
    }
    printMultiArray(mul, row1, col2);    
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
    System.out.println("Multiplication of 2 Matrix: ");
    multiMatrix(arr1, row1, col1, arr2, row2, col2);
  }
}
