// Write a program to print absolute value of a number entered by the users.

import java.util.Scanner;

public class PWL_51 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number :");
    int num = sc.nextInt();
    if (num < 0) {
      num = num * -1;
    }
    System.out.print("The absolute value is : " + num);
    sc.close();
  }
}
