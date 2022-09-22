// Calculating the Factorial of the Number

import java.util.*;

class Factorial {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number you want the factorial : ");
    int num = sc.nextInt();
    int fac = 1;
    for (int i = 1; i <= num; i++) {
      fac *= i;
    }
    System.out.println("The Factorial of " + num + " is " + fac);
  }
}
