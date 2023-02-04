// Printing the element of Mutlidemesional in the Spiral

import java.util.*;

class Spiralprint {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number of Rows : ");
    int row = sc.nextInt();
    System.out.print("Enter the Number of Columns : ");
    int col = sc.nextInt();
    int[][] multiarr = new int[row][col];
    // Taking Input from User

    for (int i = 0; i < row; i++) { // Input row
      for (int j = 0; j < col; j++) { // Input col
        multiarr[i][j] = sc.nextInt();
      }
    }

    // Output

    for (int i = 0; i < row; i++) { // Output row
      for (int j = 0; j < col; j++) {
        if ((i == 0 || j == col - 1) || (j == 0 || i == col - 1)) {
          System.out.print(multiarr[i][j] + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
