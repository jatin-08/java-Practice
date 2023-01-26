// Given two number x and y find product of them.

import java.util.*;

public class FindProductByRecursion {

  // Creating a findProduct() -> It return the product of two number.
  public static int findProduct(int num, int mult) {
    // Base Case
    if (num == 0 || mult == 0) {
      return 0;
    }
    return findProduct(num, mult - 1) + num; // Recursive work + self work
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    System.out.print("Enter the Multiple: ");
    int mult = sc.nextInt();
    System.out.println(num + " X " + mult + " = " + findProduct(num, mult));
  }
}
