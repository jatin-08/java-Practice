// Printing the Hollow reactangle Pattren.

import java.util.*;

class HollowRectangle {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter the number of colomns: ");
    int cols = sc.nextInt();
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= cols; j++) {
        if (i == 1 || i == rows || j == 1 || j == cols) {
          System.out.print(" * ");
        } else {
          System.out.print("   ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
