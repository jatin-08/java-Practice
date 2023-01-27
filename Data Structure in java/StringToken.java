/*
Sample Input

He is a very very good boy, isn't he?
Sample Output

10
He
is
a
very
very
good
boy
isn
t
he
*/

import java.util.*;

public class StringToken {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    int b = s.length();
    if (b > 0) {
      String su[] = s.split("[!,?._'@\\s]+"); // [!,?._'@\\s] -> String Puncutation matcher. 
      int a = su.length;
      System.out.println(a);
      for (int i = 0; i < a; i++) System.out.println(su[i]);
    } else System.out.println("0");
    scan.close();
  }
}
