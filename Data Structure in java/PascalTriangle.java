// Printing the pattren of PascalTriangle.\
/*
Pascal pattren : n = 5
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
*/

import java.util.*;

public class PascalTriangle {

  // Creating a function printMultiArray for Printig the element of the 2D Array.

  public static void printMultiArray(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  // Creating a function pascalTriangle for printing the pattren of pascalpattren.

  public static int[][] pascalTriangle(int rows) {
    int ans[][] = new int[rows][];
    for (int i = 0; i < rows; i++) {
      // ith rows has ith + 1 columns
      ans[i] = new int[i + 1];
      // 1st and last element in each row is 1.
      ans[i][0] = ans[i][i] = 1;
      // ans[i][j] = ans[i-1][j] + ans[i-1][j-1]
      for (int j = 1; j < i; j++) {
        ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
      }
    }
    return ans;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of Num: ");
    int num = sc.nextInt();
    int ans[][] = pascalTriangle(num);
    printMultiArray(ans);
    sc.close();
  }
}
