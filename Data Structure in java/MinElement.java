// Calculate the minimum element in the array using standard library method for calculating the minimum element.

import java.util.*;

public class MinElement {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of Array : ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the element of Array : ");

    // for taking input
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    // for printing the output
    for (int i = 1; i < arr.length - 1; i++) {
      if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
        System.out.print(arr[i]);
        break;
      }
    }
  }
}
