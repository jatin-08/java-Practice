// Find the reverse of digit for a given number n

import java.util.*;

class ReverseDigit {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int num = sc.nextInt();
    int reversedigit = 0;
    int original_num = num;
    while (num > 0) {
      reversedigit = reversedigit * 10 + num % 10;
      num = num / 10;
    }
    System.out.print("The Reverse of " + original_num + " = " + reversedigit);
  }
}
