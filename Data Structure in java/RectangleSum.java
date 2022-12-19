// Given a matrix 'a' of dimension and 2 coodinate (l1,r1) and (l2,r2).Return the sum of the rectangle from (l1,r1) to (l2,r2).

import java.util.*;

public class RectangleSum {

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

  // Creating a function findPrefixSum in 2D Array.

  public static void findPrefixSum(int arr[][]) {
    int rows = arr.length;
    int cols = arr[0].length; // if cols > 0
    // Traverse horizontally to calculate row - wise prefix sum
    for (int i = 0; i < rows; i++) {
      for (int j = 1; j < cols; j++) {
        arr[i][j] += arr[i][j - 1];
      }
    }

    // Traverse vertically to calculate column - wise prefix sum.
    for (int j = 0; j < cols; j++) {
      for (int i = 1; i < rows; i++) {
        arr[i][j] += arr[i - 1][j];
      }
    }
  }

  // 1st approach : Creating a function rectangleSum  that give the sum of the rectangle from (l1, r1) to (l2, r2).

  public static int rectangleSum(int arr[][], int l1, int r1, int l2, int r2) {
    int sum = 0;
    for (int i = l1; i <= l2; i++) {
      for (int j = r1; j <= r2; j++) {
        sum += arr[i][j];
      }
    }
    return sum;
  }

  // 2nd approach : Creating a function rectangleSum  that give the sum of the rectangle from (l1, r1) to (l2, r2).

  public static int rectangle2Sum(int arr[][], int l1, int r1, int l2, int r2) {
    int sum = 0;
    findPrefixSum(arr);
    for (int i = l1; i <= l2; i++) {
      // r1 to r2 sum for row i
      if (r1 > 0) {
        sum += arr[i][r2] - arr[i][r1 - 1];
      } else {
        sum += arr[i][r2];
      }
    }
    return sum;
  }

  // 3rd approach : Creating a function rectangleSum  that give the sum of the rectangle from (l1, r1) to (l2, r2).

  public static int rectangle3Sum(int arr[][], int l1, int r1, int l2, int r2) {
    int sum = 0;
    int ans = 0;
    int up = 0;
    int left = 0;
    int leftup = 0;
    findPrefixSum(arr);
    sum = arr[l2][r2];
    if (l1 > 0) {
      up = arr[l1 - 1][r2];
    }
    if (r1 > 0) {
      left = arr[l2][r1 - 1];
    }
    if (l1 > 0 && r1 > 0) {
      leftup = arr[l1 - 1][r1 - 1];
    }
    ans = sum - up - left + leftup;
    return ans;
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
    inputMultiArray(arr);
    System.out.print("Enter the rectangle boundaries l1, r1, l2, r2:");
    int l1 = sc.nextInt();
    int r1 = sc.nextInt();
    int l2 = sc.nextInt();
    int r2 = sc.nextInt();
    System.out.println("Printing the element of Array!!");
    printMultiArray(arr);
    System.out.println(
      "Rectangle Sum from 1st approach: " + rectangleSum(arr, l1, r1, l2, r2)
    );
    // System.out.print(
    //   "Rectangle Sum from 2nd approach: " + rectangle2Sum(arr, l1, r1, l2, r2)
    // );
    System.out.println(
      "Rectangle Sum from 3rd approach: " + rectangle3Sum(arr, l1, r1, l2, r2)
    );
  }
}
