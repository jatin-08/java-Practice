/*  Find the square root with precision using binary search.

input -> number = 24 precision = 3
output -> 4.898

*/

import java.util.*;

class SqrtWithPrecision {

  public static float findSqrtWithPrecision(int num, int precision) {
    int st = 0, end = num;
    double ans = 0.0;
    while (st <= end) {
      int mid = st + (end - st) / 2;
      if (mid * mid == num) {
        ans = mid;
        return (float) ans;
      } else if (mid * mid < ans) {
        st = mid + 1;
        ans = mid;
      } else {
        end = mid - 1;
      }
    }

    double inc = 0.1;
    for (int i = 0; i < precision; i++) {
      while (ans * ans <= num) {
        ans += inc;
      }
      ans = ans - inc;
      inc = inc / 10;
    }
    return (float) ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number you want to find the Square: ");
    int num = sc.nextInt();
    System.out.println("Enter the Value of Precision: ");
    int precision = sc.nextInt();
    System.out.println("Printing the square root with precision: "+ findSqrtWithPrecision(num, precision));
    sc.close();
  }
}