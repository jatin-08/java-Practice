// find that the given number is prime or composite.

import java.util.*;

class Checkprime {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number you want to check : ");
    int num = sc.nextInt();
    int m = 0;
    m = num / 2;
    int flag = 0;
    if (num == 0 || num == 1) {
      System.out.println("It is neither prime or nor composite !!!");
    } else {
      for (int i = 2; i <= m; i++) {
        if (num % i == 0) {
          System.out.println(num + " is Composite Number!!!");
          flag = 1;
          break;
        }
      }
      if (flag == 0) {
        System.out.println(num + " is Prime Number!!!");
      }
    } // end of else
  }
}
