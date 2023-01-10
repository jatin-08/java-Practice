// Given a two numbers . Find the greatest common divisor of x and y using recursion.

import java.util.*;

public class GCD {

  // Creating a function iGCD -> It return the GCD of the given two number. Time complexity -> T(n) = O(num1, num2).
  public static int iGCD(int num1, int num2) {
    while (num1 % num2 != 0) {
      int rem = num1 % num2;
      num1 = num2;
      num2 = rem;
    }
    return num2;
  }

  // Creating a gcd-> It return the GCD of the given two number by recursive approach.
  public static int gcd(int num1, int num2) {
    if (num2 == 0) { // GCD (number, 0) = number itself.
      return num1;
    }
    return gcd(num2, num1 % num2); // GCD(x, y) = GCD(y, x % y).
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter the Second number: ");
    int num2 = sc.nextInt();
    System.out.println(
      "GCD of " + num1 + " and " + num2 + " : " + iGCD(num1, num2)
    );
    System.out.println(
      "Printing the GCD of " + num1 + " and " + num2 + " : " + gcd(num1, num2)
    );

    // Formula for calculating the LCM of the given numbers.
    int lcm = (num1 * num2) / gcd(num1, num2);
    System.out.println(
      "Printing the LCM of " + num1 + " and " + num2 + " : " + lcm
    );
  }
}
