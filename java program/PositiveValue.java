// Print only the Positive number from the array.

import java.util.*;

public class PositiveValue {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of Array : ");
    int size = sc.nextInt();
    System.out.print("Enter the element of Array : ");
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > -1) {
        System.out.print(arr[i]);
      }
    }
    sc.close();
  }
}
