// Given a number num and value k. print k multiples of num.
// constraints-> k>0
// input: num = 12 , k = 5
// output: 12,24,36,48,60

import java.util.*;

public class Kmultiple {

  // Creating a function kthMultiple()-> It gives 1st to kth multiple of the given number.
  public static void kthMultiple(int num, int k) {
    if (k == 0) { // base case
      return;
    }
    // Recursive work
    kthMultiple(num, k - 1);
    //Self work
    System.out.print(" " + num * k);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int num = sc.nextInt();
    System.out.print("Enter the multiple: ");
    int k = sc.nextInt();
    System.out.print("1st to " + k + " multiple of " + num + " : ");
    kthMultiple(num, k);
    sc.close();
  }
}
