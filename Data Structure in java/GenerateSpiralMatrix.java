// Given a positive integer n, generate an n*n matrix filled with element from 1 to n^2 in spiral order.

import java.util.*;

public class GenerateSpiralMatrix {

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

  public static void inputMultiArray(int arr[][]) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
  }

  // Creating a function sprialMatrix that print the matrix in the sprial order.

  public static int[][] generateSprialMatrix(int n) {
    int arr[][] = new int[n][n];
    int toprow = 0;
    int bottomrow = n - 1;
    int rightcol = n - 1;
    int leftcols = 0;
    int count = 1;
    while (count <= n * n) {
      // toprow -> leftcols to rightcols
      for (int j = leftcols; j <= rightcol && count <= n * n; j++) {
        arr[toprow][j] = count++;
      }
      toprow++;
      // rightcol -> toprow to bottomrow
      for (int i = toprow; i <= bottomrow && count < n * n; i++) {
        arr[i][rightcol] = count++;
      }
      rightcol--;
      // bottomrow -> rightcols to leftcols
      for (int j = rightcol; j >= leftcols && count < n * n; j--) {
        arr[bottomrow][j] = count++;
      }
      bottomrow--;
      // leftcols -> bottomrow to toprow
      for (int i = bottomrow; i >= toprow && count < n * n; i--) {
        arr[i][leftcols] = count++;
      }
      leftcols++;
    }
    return arr;
  }

  // it is the main function.

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int num = sc.nextInt();
    int ans[][] = generateSprialMatrix(num);
    printMultiArray(ans);
  }
}
