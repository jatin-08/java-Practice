//  Printing the Armstrong Number

import java.util.*;

class ArmstrongNumber {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number! : ");
    int n = sc.nextInt();
    int rem, result = 0;
    int temp;
    temp = n;
    while (temp > 0) {
      rem = temp % 10;
      result += rem*rem*rem;
      temp /= 10;
    }
    if (result == n) {
      System.out.println(n + " The given Number is Armstrong Number!!");
    } else {
      System.out.println(n + " The given Number is not a Armstrong Number!!");
    }
  }
}
