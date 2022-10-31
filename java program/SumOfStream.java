// Print the sum of the stream of integers in the input.

import java.util.Scanner;

public class SumOfStream {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number :");
    int num = sc.nextInt();
    int sum = 0;
    while (num != -1) {
      sum += num;
      num = sc.nextInt();
    }
    System.out.print("The sum is " + sum);
  }
}
