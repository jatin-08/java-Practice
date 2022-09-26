// Swapping the Two String Example "Jatin Yadav" ---> "Yadav Jaitn"

import java.util.*;

public class SwappingString {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the First String : ");
    String str1 = sc.next();
    System.out.print("Enter the Second String : ");
    String str2 = sc.next();
    System.out.println("Before Swapping the String : " + str1 + " " + str2);
    str1 = str1 + str2;
    str2 = str1.substring(0, (str1.length() - str2.length()));
    str1 = str1.substring(str2.length());
    System.out.println("After Swapping the String : " + str1 + " " + str2);
  }
}
