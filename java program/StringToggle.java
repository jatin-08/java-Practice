/* 
 Given a string , the task is to toggle all the characters of the string i.e., convert Upper Case to Lower Case
 and vice versa.

 input -> PhysICS
 output -> pHYSics
*/

import java.util.*;

public class StringToggle {

  // Creating a stringToggleByStringBuilder() -> It will print the String in toggle form by using String Builder.
  public static void stringToggleByStringBuilder(String str) {
    StringBuilder strbuild = new StringBuilder(str);
    for (int i = 0; i < str.length(); i++) {
      boolean flag = true; // it means that the character is in upper Case
      char ch = strbuild.charAt(i);
      if (ch == ' ') { // If String contains space it doesnot include space in toggle.
        continue;
      }
      int ascii = (int) ch;
      if (ascii >= 97) {
        flag = false; // It means that the character at i is small
      }
      if (flag == true) {
        ascii += 32;
        char dh = (char) ascii;
        strbuild.setCharAt(i, dh);
      } else {
        ascii -= 32;
        char dh = (char) ascii;
        strbuild.setCharAt(i, dh);
      }
    }
    System.out.println("Toggle String: " + strbuild);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String: ");
    String str = sc.nextLine();
    System.out.println(str);
    stringToggleByStringBuilder(str);
    sc.close();
  }
}
