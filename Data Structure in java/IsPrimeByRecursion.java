// Checking if the given number is prime or not.

import java.util.*;

public class IsPrimeByRecursion {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int num = sc.nextInt();
    int flag = 0;
    if (isPrime(num, flag) == 1) {
      System.out.println(num + " is a Prime number!");
    } else {
      System.out.println(num + " is a Composite Number!");
    }
  }

  // Creating an isPrime() -> It return if the given number is prime or not.
  // Time complexity -> T(n) = O(n) , Space complexity -> S(n) = O(1).
  public static int isPrime(int num, int flag) {
    for (int i = 2; i <= num; i++) {
      if (num % i == 0) {
        flag++;
      }
    }
    return flag;
  }
}
