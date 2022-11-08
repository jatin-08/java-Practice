// Printing the Pyramid Pattren.

import java.util.*;

class Pyramid {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int rows = sc.nextInt();
    for (int i = 1; i <= rows; i++) {
      for (int k = 1; k <= rows - i; k++) {
        System.out.print("   ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }
}
