// Given a number n, print the following pattern without using the loop.

import java.util.*;

public class PrintPattern {

  // Creating a printPattern -> It return the Given pattern n, n-5, n-10,...n+5,n.
  public static void printPattern(int num, int temp, boolean flag) {
    System.out.print(temp + " ");
    // Base Case
    if (temp == num && flag == false) {
      return;
    }
    if (flag == true) {
      if (temp - 5 > 0) {
        printPattern(num, temp - 5, true);
      } else {
        printPattern(num, temp - 5, false);
      }
    } else {
      printPattern(num, temp + 5, false);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int num = sc.nextInt();
    System.out.print("The Pattern: ");
    printPattern(num, num, true);
    sc.close();
  }
}
