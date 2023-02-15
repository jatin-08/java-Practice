/* 
input -> anagram
         margana
output -> Anagran        

*/

import java.util.*;

public class Anagram {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String: ");
    String str1 = sc.next();
    System.out.println("Enter the Another String: ");
    String str2 = sc.next();
    char[] s1 = str1.toLowerCase().toCharArray();
    char[] s2 = str2.toLowerCase().toCharArray();
    System.out.println();
    sc.close();
  }
}
