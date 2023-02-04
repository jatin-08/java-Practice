/* Sample Input

1234
20

Sample Output

1254
24680

Explation

1234 + 20 = 1254
1234 * 20 = 24680

*/

import java.math.*;
import java.util.*;

public class Bigint {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    BigInteger a = sc.nextBigInteger();
    BigInteger b = sc.nextBigInteger();
    System.out.println(a.add(b));
    System.out.println(a.multiply(b));
    sc.close();
  }
}
