// Printing the Star pattren

import java.util.*;

class Star {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number! : ");
    int num = sc.nextInt();

    // Taking Input from User

    for (int i = num; i > 0; i--) { // Input row
      for (int k = 0; k < num - i; k++) { // Input col
        System.out.print(" ");
      }
      for (int j = i; j > 0; j--) {
        System.out.print(" * ");
      }
      System.out.println();
    }
    for (int i = 2; i <= num; i++) { // Input row
      for (int k = num; k > i; k--) { // Input col
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }
}
