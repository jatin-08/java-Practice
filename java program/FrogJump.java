/* There are N stones, numbered 0,1,2,----,N-1. For each i (0<=i<n), the height of stone is hi. there is a frog
who initially on Stone 0. He will repeat the following action some number of times to reach Stone N-1.
If the frog is currently on stone i, jump to i+1 or Stone i+2. Here a cost of |hi-hj| is incurred, where j is the Stone on land.
Find the minimum possible total cost incurred before the frog reaches Stone N.

Input n = 4
arr[] =   10 30 40 20
Output = 30
*/

import java.util.*;

public class FrogJump {

  // Creating a inputArray -> It takes input from the user.
  public static void inputArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i <= size - 1; i++) {
      arr[i] = sc.nextInt();
    }
  }

  // Creating a frogJump -> It return the total minimum cost incurred before the frog reaches Stone N.
  // Time complexity -> T(n) -> O(2^n)
  public static int frogJump(int[] height, int size, int idx) {
    // Base Case
    if (idx >= size - 1) {
      return 0;
    }
    // Recursive work
    int opt1 =
      Math.abs(height[idx] - height[idx + 1]) + frogJump(height, size, idx + 1);
    if (idx == size - 2) {
      return opt1;
    }
    int opt2 =
      Math.abs(height[idx] - height[idx + 2]) + frogJump(height, size, idx + 2);
    return Math.min(opt1, opt2);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of the Array: ");
    int size = sc.nextInt();
    System.out.print("Enter the element of the Array: ");
    int[] height = new int[size];
    inputArray(height, size);
    System.out.println(
      "The Minimum Cost incurred before the Frog reach to last Stone: " +
      frogJump(height, size, 0)
    );
  }
}
