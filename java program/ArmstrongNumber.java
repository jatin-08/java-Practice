//  Printing the Armstrong Number

import java.util.*;

class ArmstrongNumber {

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
    if (num == 0) return 1;
    return pow(num % 10, result) + isArmstrong(num / 10, result); // Recursive work + self work
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number! : ");
    int n = sc.nextInt();
    int rem, result = 0;
    int temp;
    temp = n;
    while (temp > 0) {
      rem = temp % 10;
      result += rem * rem * rem;
      temp /= 10;
    }
    if (result == n) {
      System.out.println(n + " The given Number is Armstrong Number!!");
    } else {
      System.out.println(n + " The given Number is not a Armstrong Number!!");
    }

    System.out.println(
      "Checking if the number is Armstrong or not by Recursion!"
    );
    if (n == isArmstrong(n, result)) {
      System.out.println(n + " The given Number is Armstrong Number!!");
    } else {
      System.out.println(n + " The given Number is not a Armstrong Number!!");
    }
    sc.close();
  }
}
