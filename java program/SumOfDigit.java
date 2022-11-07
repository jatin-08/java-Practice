// Find the sum of digit for a given number n

import java.util.*;

class SumOfDigit {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int num = sc.nextInt();
    int sumofdigit = 0;
    int original_num = num;
    while (num > 0) {
      sumofdigit += num % 10;
      num = num / 10;
    }
    System.out.print("The sum of " + original_num + " = " + sumofdigit);
  }
}
