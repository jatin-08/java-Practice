// Write a program to check that the given string is palindrome or not.

import java.util.*;

public class PalindromeString {

  // Creating a checkPalindromeString -> It return true if palindrome string exist or otherwise return false.
  // Time complexity -> T(n) = O(n^2)
  public static String checkPalindromeString(String str, int index) {
    // Base Case
    if (index == str.length()) {
      return "";
    }
    String smallStr = checkPalindromeString(str, index + 1); // Recursive work. T(n) = O(n)
    char currentStr = str.charAt(index); // T(n) = O(n)
    return smallStr + currentStr;
  }

  // Creating a check2PalindromeString -> By Approach 2nd this function return if the given string is a palindrome or not.
  // Time complexity -> T(n) = O(n)
  public static boolean check2PalindromeString(
    String str,
    int leftidx,
    int rightidx
  ) {
    // Base Case
    if (leftidx >= rightidx) {
      return true;
    }
    return (
      str.charAt(leftidx) == str.charAt(rightidx) &&
      check2PalindromeString(str, leftidx + 1, rightidx - 1)
    );
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String: ");
    String orgStr = sc.nextLine();
    String revStr = checkPalindromeString(orgStr, 0);
    if (revStr.equals(orgStr)) {
      System.out.println("YES! It is a Palindrome String.");
    } else {
      System.out.println("NO! It is not a Palindrome String.");
    }
    System.out.println(
      "by 2nd Approach Checking if the given string is Palindrome or not: " +
      check2PalindromeString(orgStr, 0, orgStr.length() - 1)
    );
  }
}
