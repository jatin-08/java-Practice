// Converting the Binary Number into the Decimal Number

import java.util.*;

public class BinaryToDecimal {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Binary Number you want to find the Decimal : ");
    int binary_num = sc.nextInt();
    int original_num = binary_num;
    int result = 0; // After converting the Binary to Decimal is store in the result variable
    int pw = 1; // Power raise to 2^0
    while (binary_num > 0) {
      int unit_digit = binary_num % 10;
      result += (unit_digit * pw);
      pw *= 2;
      binary_num /= 10;
    }
    System.out.print(
      "The decimal number of this binary number " +
      original_num +
      " = " +
      result
    );
  }
}
