/* 
input -> anagram
         margana
output -> Anagran        

*/

import java.util.*;

public class Anagram {

  public static boolean isAnagram(String str1, String str2) {
    // It remove all the space and convert the string into Lower case.
    str1 = str1.replaceAll("\\s", "").toLowerCase();
    str2 = str2.replaceAll("\\s", "").toLowerCase();

    if (str1.length() != str2.length()) {
      return false;
    }

    char[] str1Array = str1.toCharArray();
    char[] str2Array = str2.toCharArray();
    Arrays.sort(str1Array);
    Arrays.sort(str2Array);
    return Arrays.equals(str1Array, str2Array);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String: ");
    String str1 = sc.next();
    System.out.println("Enter the Another String: ");
    String str2 = sc.next();
    if (isAnagram(str1, str2)) {
      System.out.println("Anagram");
    } else {
      System.out.println("Not Anagram");
    }
    sc.close();
  }
}
