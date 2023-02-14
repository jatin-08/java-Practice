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

  // Creating a findSqrtWithPricision() -> It return the closet sqrt with pricision.
  public static float findSqrtWithPricision(int num, int pricision) {
    int st = 0, end = num;
    double ans = -1.0;
    while (st <= end) {
      int mid = st + (end - st) / 2;
      double val = mid * mid;
      if (val == num) {
        return mid;
      } else if (val < num) {
        st = mid + 1;
        ans = mid;
      } else {
        end = end - 1;
      }
    }
    double increment = 0.1;
    for (int i = 0; i < pricision; i++) {
      while (ans * ans <= num) {
        ans += increment;
      }
      ans = ans - increment;
      increment = increment / 10;
    }
    return (float) ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Square root: ");
    int num = sc.nextInt();
    System.out.print("Enter the value of Pricision: ");
    int pricision = sc.nextInt();
    System.out.println("The Sqrt of " + num + " is " + findSqrt(num));
    System.out.println(
      "The Sqrt of " + num + " is " + findSqrtWithPricision(num, pricision)
    );
    sc.close();
  }
}
