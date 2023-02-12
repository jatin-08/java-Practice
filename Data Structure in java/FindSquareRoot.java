/* 
Find the Square Root of the given non negative number x. Round it off its nearest floor integer value.

input -> x=20
output -> 4

*/

import java.util.*;

public class FindSquareRoot {

  // Creating a findSqrt() -> It return the squre root of that number or closest value of that sqrt.
  public static int findSqrt(int num) {
    int st = 0, end = num, ans = -1;
    while (st <= end) {
      int mid = st + (end - st) / 2;
      long val = mid * mid;
      if (val == num) {
        return mid;
      } else if (val < num) {
        st = mid + 1;
        ans = mid;
      } else {
        end = mid - 1;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Square root: ");
    int num = sc.nextInt();
    System.out.print("The Sqrt of " + num + " is " + findSqrt(num));
    sc.close();
  }
}
