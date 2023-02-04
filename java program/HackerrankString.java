/* Sample Input 0

 hello
 java

Sample Output 0

 9
 No
 Hello Java

*/

import java.util.*;

public class HackerrankString {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();

    /* Enter your code here. Print output to STDOUT. */

    System.out.println(A.length() + B.length());
    for (int i = 0; i < A.length() && i < B.length(); i++) {
      if (A.charAt(i) > B.charAt(i)) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
      break;
    }
    char c = A.charAt(0);
    String d = Character.toString(c);
    char e = B.charAt(0);
    String f = Character.toString(e);
    System.out.println(
      d.toUpperCase() + A.substring(1) + " " + f.toUpperCase() + B.substring(1)
    );
    sc.close();
  }
}
