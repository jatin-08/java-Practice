/*
 Given a decimal number as input, we need to write a program to convert  the given decimal number into its equivalent binary number.

input: 7
output: 111

*/

import java.util.*;

public class DecimalToBinary {

  //   static int level = -1;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int decimalNumber = sc.nextInt();
    System.out.println(
      "Binary of " + decimalNumber + " is " + findBinary(decimalNumber)
    );
    sc.close();
  }

  // Creating a findBinary() -> It return the Binary number of the given decimal number.
  public static int findBinary(int decimalNumber) {
    if (decimalNumber == 0) {
      return 0;
    } else {
      return (decimalNumber % 2 + 10 * findBinary(decimalNumber / 2));
    }
  }
}
