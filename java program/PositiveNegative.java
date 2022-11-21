// Print all negative element at the end of the array without changing the order of positive elements and negative elements.

import java.util.*;

public class PositiveNegative {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];

    // taking input
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int[] ans = new int[size];
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= 0) {
        ans[count] = arr[i];
        count++;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        ans[count] = arr[i];
        count++;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(ans[i] + "  ");
    }
  }
}
