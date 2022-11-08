// Find the A raise to the power B

import java.util.*;

class Power {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num = sc.nextInt();
    int ans = 1;
    System.out.print("Enter the power : ");
    int numpow = sc.nextInt();
    for (int i = 1; i <= numpow; i++) {
      ans = ans * num;
    }
    System.out.print(+num + " raise to the Power " + numpow + " = " + ans);
  }
}
