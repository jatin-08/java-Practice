/*

Search the target value in 2d Array integer Matrix of dimension of m*n and true if exist, else return false.

This matrix has the following properties:

1. Integer in each row are sorted from left to right
2. This first integer of each row is greater than the last integer of the preivous row.

input : Matrix = [[1,3,5,7],[10,11,12,14],[22,23,24,25]], target =3
output : true.

 */

import java.util.*;

public class SearchIn2DArray {

  // Creating an input2DArray() -> It takes input from the user
  public static void input2DArray(int[][] arr, int row, int col) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < arr.length; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println();
    sc.close();
  }

  //Creating a print2DArray() -> It print the element of the 2D Array
  public static void print2DArray(int[][] arr, int row, int col) {
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  // Creating a searchInMatrix() -> It will return true if target find otherwise it return false.
  public static boolean searchInMatrix(
    int[][] arr,
    int row,
    int col,
    int target
  ) {
    int st = 0, end = row * col - 1;
    while (st <= end) {
      int mid = st + (end - st) / 2;
      int midElement = arr[mid / col][mid % col];
      if (target == midElement) {
        return true;
      } else if (midElement > target) {
        end = mid - 1;
      } else {
        st = mid + 1;
      }
    }
    return false;
  }

  // Creating a searchInMatrix2()-> It will also return if target find otherwise return false.
  // But in this the 2D array will be sorted from left to right and up to down.
  /* 
  1 4 7   
  2 5 8
  3 6 9
  */

  public static boolean searchInMatrix2(
    int[][] arr,
    int row,
    int col,
    int target
  ) {
    int i = 0, j = col - 1;
    while (i < row && j >= 0) {
      if (arr[i][j] == target) {
        return true;
      } else if (target < arr[i][j]) {
        j--; // move left
      } else {
        i++; // move down
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Rows: ");
    int row = sc.nextInt();
    System.out.print("Enter the cols: ");
    int col = sc.nextInt();
    System.out.print("Enter the value of the Target: ");
    int target = sc.nextInt();
    int[][] arr = new int[row][col];
    System.out.print("Enter the Element of the 2D Array: ");
    input2DArray(arr, row, col);
    System.out.println("Printing the element of the 2D Array: ");
    print2DArray(arr, row, col);
    System.out.println("By 1st Type: " + searchInMatrix(arr, row, col, target));
    System.out.println(
      "By 2nd Type: " + searchInMatrix2(arr, row, col, target)
    );
    sc.close();
  }
}
