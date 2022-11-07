// Count the Number of digit for a given number n

import java.util.*;

class CountDigit {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int num = sc.nextInt();
    int numdigit = 0;
    int original_num = num;
    while (num > 0) {
      num /= 10;
      numdigit++;
    }
    System.out.print("Number of digit in " + original_num + " = " + numdigit);
  }
}
