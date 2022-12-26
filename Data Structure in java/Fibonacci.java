// Calculating the Fibonacci series number by using recursion.

import java.util.*;

public class Fibonacci {

  // Creating a function fibonacciSeries -> it gives the number present on that term.
  public static int fibonacciSeries(int num) {
    if (num == 0) { // Base Case
      return 0;
    }
    if (num == 1) { // Base Case
      return 1;
    }
    return fibonacciSeries(num - 1) + fibonacciSeries(num - 2); // Subproblem + self work
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of the Series: ");
    int num = sc.nextInt();
    System.out.println(
      "The number present on term " + num + " : " + fibonacciSeries(num)
    );
  }
}
