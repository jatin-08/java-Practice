// Printing the String in the reverse order

import java.util.*;

public class ReverseStringByRecursion {

  // Creating a reverseString -> It return the String in the reverse order.
  // Time complexity -> T(n) = O(n^2)
  public static String reverseStringByRecursion(String str, int index) {
    // Base Case
    if (index == str.length()) {
      return "";
    }
    String smallStr = reverseStringByRecursion(str, index + 1); // Recursive work. T(n) = O(n)
    char currentStr = str.charAt(index); // T(n) = O(n)
    return smallStr + currentStr;
  }

  // Creating a reverseString() -> It reverse the string without using recursion.
  public static String reverseString(String str) {
    char[] ch = str.toCharArray();
    String revstr = "";
    for (int i = ch.length - 1; i >= 0; i--) {
      revstr += ch[i];
    }
    return revstr;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String: ");
    String str = sc.nextLine();
    System.out.println(
      "The Reverse String: " + reverseStringByRecursion(str, 0)
    );
    System.out.println("Reversed String: " + reverseString(str));
    sc.close();
  }
}
