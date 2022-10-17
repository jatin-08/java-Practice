//  WAP to input a sentence and print each word of the string along with its length in tabular form.

import java.util.*;

public class StringSplit {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Sentence : ");
    String str = sc.nextLine();
    String s[] = str.split("\\s"); // str.split("\\s") is used to split the string form the white space convert it into substrings.
    for (int i = 0; i < str.length(); i++) {
      System.out.println(s[i] + "\t" + s[i].length());
    }
  }
}
