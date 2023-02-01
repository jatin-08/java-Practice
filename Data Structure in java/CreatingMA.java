// Creating Multidemensional Array
// Finding the element At the index in Multidemension array

import java.util.*;

class CreatingMA {

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
    System.out.println(
      "Enter the element you want know is this is present or not !"
    );
    int x = sc.nextInt();

    // Printing the element of multiarr

    for (int i = 0; i < row; i++) { // Output row
      for (int j = 0; j < col; j++) { // Output col
        if (multiarr[i][j] == x) {
          System.out.println(
            "The element is found at" + "(" + i + " " + j + ")"
          );
        }
      }
    }
    sc.close();
  }
}
