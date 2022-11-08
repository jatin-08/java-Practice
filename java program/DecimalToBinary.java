// Converting the Decimal Number into the Binary Number

import java.util.*;

public class DecimalToBinary {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Decimal Number you want to find the Binary : ");
    int decimal_num = sc.nextInt();
    int original_num = decimal_num;
    int result = 0; // After converting the Decimal to Binary is store in the result variable
    int pw = 1; // Power raise to 10^0
    while (decimal_num > 0) {
      int parity = decimal_num % 2;
      result += (parity * pw);
      pw *= 10;
      decimal_num /= 2;
    }
    System.out.print(
      "The binary number of this decimal number " +
      original_num +
      " = " +
      result
    );
  }
}
