// Converting the int into a String by using the String.valueof() method

import java.util.*;

class IntToString {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int n = sc.nextInt();
    String s = String.valueOf(n);
    if (n == Integer.parseInt(s)) {
      System.out.println("Good Job");
    } else {
      System.out.println("Wrong answer");
    }
    sc.close();
  }
}
