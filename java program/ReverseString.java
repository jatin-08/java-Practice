// Printing the String in the Reverse order

import java.io.*;
import java.util.*;

public class ReverseString {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();

    int length = A.length();
    String reverse = "";

    for (int i = length - 1; i >= 0; i--) {
      reverse += A.charAt(i);
    }

    // Printing the String in reverse order by using Built in Reverse function

    StringBuilder input = new StringBuilder();

    // Append a string into StringBuilder input

    input.append(A);

    // Reverse StringBuilder input

    input.reverse();
    System.out.println(input);

   // Comparing the String is equal after reversing it.

    if (A.equals(reverse)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
