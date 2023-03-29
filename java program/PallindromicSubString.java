/*
Given a string s, return the number of pallindromic substring in it.

input -> abc  substring of abc: a, ab, abc, bc, b, c i.e., a, b, c are the pallindromic substring of abc.
output -> 3

*/

import java.util.*;

public class PallindromicSubString {

  // Creating a isPalindrome() -> it will return true if the string is palindrome other wise return false.
  public static boolean isPalindrome(String str) {
    int st = 0, end = str.length() - 1;
    while (st <= end) {
      if (str.charAt(st) != str.charAt(end)) {
        return false;
      }
      st++;
      end--;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    System.out.println("Enter the String: ");
    String str = sc.nextLine();
    System.out.println(str);
    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j <= str.length(); j++) {
        if (isPalindrome(str.substring(i, j)) == true) {
          System.out.println("Printing the substring: " + str.substring(i, j));
          count++;
        }
      }
    }
    System.out.println("The number of count: " + count);
    sc.close();
  }
}
