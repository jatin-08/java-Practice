// Calculating the Factorial of the Number and by using recursion.

import java.util.*;

class Factorial {

  // Creating a function factorialByRecursion that gives the factorial of the number by using recursion.
  public static int factorialByRecursion(int num) {
    if (num == 0) { // Base Case.
      return 1;
    }
    return num * factorialByRecursion(num - 1); // Subproblem and self work.
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number you want the factorial : ");
    int num = sc.nextInt();
    int fac = 1;
    for (int i = 1; i <= num; i++) {
      fac *= i;
    }
    System.out.println("The Factorial of " + num + " is " + fac);
    System.out.println(
      "The Factorial of " +
      num +
      " By using Recursion: " +
      factorialByRecursion(num)
    );
    sc.close();
  }
}
