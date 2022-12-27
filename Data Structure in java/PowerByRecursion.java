// Given two numbers p and q, find the value of p^q using recursion.

import java.util.*;

public class PowerByRecursion {

  // Creating a function powerOfNumber -> It gives the Value of p^q. Time complexity -> O(po).
  public static int powerOfNumber(int num, int po) {
    if (po == 0) { // Base Case
      return 1;
    }
    return powerOfNumber(num, po - 1) * num; // Subproblem and selfwork.
  }

  //Creating a function power2OfNumber -> It gives the Value of p^q. Time complexity -> O(log(pow)).
  public static int power2OfNumber(int num, int pow) {
    if (pow == 0) { // Base case
      return 1;
    }
    int smallpow = power2OfNumber(num, pow / 2);
    if (pow % 2 == 0) {
      return smallpow * smallpow;
    }
    return smallpow * smallpow * num;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int num = sc.nextInt();
    System.out.print("Enter the Power of number: ");
    int po = sc.nextInt();
    System.out.println(
      "By 1st approach " +
      num +
      " raise to the power " +
      po +
      " : " +
      +powerOfNumber(num, po)
    );
    System.out.println(
      "By 2nd approach " +
      num +
      " raise to the power " +
      po +
      " : " +
      +power2OfNumber(num, po)
    );
  }
}
