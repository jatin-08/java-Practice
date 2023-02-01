// Checking if the given number is an armstrong number or not.

import java.util.*;

public class ArmstrongByRecursion {

  // Creating a pow -> It return the power of the given number.
  public static int pow(int num, int power) {
    // Base case
    if (power == 0) {
      return 1;
    }
    int halfpow = pow(num, power / 2);
    if (power % 2 == 0) {
      return halfpow * halfpow;
    }
    return num * halfpow * halfpow;
  }

  // Creating a isArmstrong() -> It return if the given number is a armstrong number or not by using Recursion.
  public static int isArmstrong(int num, int result) {
    // Base Case
    if (num == 0) return 0;
    return pow(num % 10, result) + isArmstrong(num / 10, result); // Recursive work + self work
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int num = sc.nextInt();
    int temp = num;
    int result = 0;
    while (temp > 0) {
      result++;
      temp /= 10;
    }
    if (num == isArmstrong(num, result)) {
      System.out.println(num + " is an Armstrong Number!");
    } else {
      System.out.println(num + " is an not Armstrong Number!");
    }
    sc.close();
  }
}
