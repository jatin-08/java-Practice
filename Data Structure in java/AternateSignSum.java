// Given a number num. Find the sum of natural number till num but in aternate signs.
// input: 5
// output: 1-2+3-4+5 = 3

import java.util.*;

public class AternateSignSum {

  // Creating a function aternateSignSum -> It gives the sum of natural number upto num but in alternate signs.
  public static int aternateSignSum(int num) {
    if (num == 1) {
      return 1;
    }
    if (num % 2 == 0) {
      return aternateSignSum(num - 1) - num;
    } else {
      return aternateSignSum(num - 1) + num;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int num = sc.nextInt();
    System.out.print(
      "Sum of natural number from 1st to " + num + " : " + aternateSignSum(num)
    );
    sc.close();
  }
}
