// Given an integer, find out the sum of its digits using recursion.

import java.util.*;

public class SumOfDigit {

  // Creating a function sumOfDigit -> It gives the sum of the Given Digit.
  public static int sumOfDigit(int digit) {
    if (digit >= 0 && digit <= 9) { // Base Case
      return digit;
    }
    return sumOfDigit(digit / 10) + digit % 10; // subproblem and selfwork.
  }

  // Creating a function countOfDigits -> it gives the number of digits are present.
  public static int countOfDigits(int digit) {
    if (digit >= 0 && digit <= 9) {
      return 1;
    }
    return countOfDigits(digit / 10) + 1;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Digit: ");
    int digit = sc.nextInt();
    System.out.println("The Sum of Digit " + digit + " : " + sumOfDigit(digit));
    System.out.println(
      "The Count of Digit " + digit + " : " + countOfDigits(digit)
    );
    sc.close();
  }
}
