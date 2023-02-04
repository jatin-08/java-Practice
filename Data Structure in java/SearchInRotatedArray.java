// Write a program to search in Rotated Array.

import java.util.*;

public class SearchInRotatedArray {

  // Creating an inputArray() -> It takes input from the user.
  public static void inputArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.close();
  }
}
