// Find the sum of Series for a given given series 1 - 2 + 3 - 4-----n

import java.util.*;

class SumOfSeries {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int num = sc.nextInt();
    int ans = 0;
    for (int i = 1; i <= num; i++) {
      if (i % 2 == 0) {
        ans -= i;
      } else {
        ans += i;
      }
    }
    System.out.print("The sum of series = " + ans);
  }
}
