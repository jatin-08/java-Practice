// Printing the String in the reverse order

import java.util.*;

public class ReverseString {

  // Creating a reverseString -> It return the String in the reverse order.
  // Time complexity -> T(n) = O(n^2)
  public static String reverseString(String str, int index) {
    // Base Case
    if (index == str.length()) {
      return "";
    }
    String smallStr = reverseString(str, index + 1); // Recursive work. T(n) = O(n)
    char currentStr = str.charAt(index); // T(n) = O(n)
    return smallStr + currentStr;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String: ");
    String str = sc.nextLine();
    System.out.println("The Reverse String: " + reverseString(str, 0));
  }
}
