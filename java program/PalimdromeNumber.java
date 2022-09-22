//  Printing the Palimdrome Number

import java.util.*;

class PalimdromeNumber {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number! : ");
    int n = sc.nextInt();
    int rem, sum = 0;
    int temp;
    temp = n;
    while (n > 0) {
      rem = n % 10;
      sum = (sum * 10) + rem;
      n /= 10;
    }
    if (temp == sum) {
      System.out.println("The given Number is Palindrome Number!!");
    } else {
      System.out.println("The given Number is not a Palindrome Number!!");
    }
  }
}
