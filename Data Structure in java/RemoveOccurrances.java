// Remove all occurrances of 'a' from the given string s = 'abcax'

import java.util.*;

public class RemoveOccurrances {

  // Creating a removeOccurrance -> It remove all occurrance of the that character from the given string. 
  // Time complexity -> T(n) = O(n^2)
  public static String removeOccurrance(String str, int index, char ch) {
    if (index == str.length()) { // Base Case
      return "";
    }
    // Recursive work
    String smallStr = removeOccurrance(str, index + 1, ch);
    char currentChar = str.charAt(index); // Extracting the current index
    // Self Work
    if (currentChar != ch) {
      return currentChar + smallStr;
    } else {
      return smallStr;
    }
  }

  // Creating a remove2Occurrance ->2nd approach: It remove all occurrance of the that character from the given string.
  // Time complexity -> T(n) = O(n^2)
  public static String remove2Occurrance(String str, char ch) {
    if (str.length() == 0) { // Base Case
      return "";
    }
    // Recursive work
    String smallStr = remove2Occurrance(str.substring(1), ch);
    char currentChar = str.charAt(0); // Extracting the current index
    // Self Work
    if (currentChar != ch) {
      return currentChar + smallStr;
    } else {
      return smallStr;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String: ");
    String str = sc.nextLine();
    System.out.print("Enter a Character you want to remove from the String: ");
    char ch = sc.next().charAt(0);
    System.out.println(
      "After removing the given character from 1st Approach: " +
      removeOccurrance(str, 0, ch)
    );
    System.out.println(
      "After removing the given character from 2nd Approach: " +
      remove2Occurrance(str, ch)
    );
  }
}
