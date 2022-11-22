// Find if there exist a pair in the array whose absolute difference is exactly the given number.

import java.util.*;

public class AbsoluteDifference {

  // Creating a function inputArray for taking input from the user.

  public static void inputArray(int arr[], int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
  }

  // Creating a function pairdifference it give output if any pair present in the array having absolute difference is exactly the given number.
  public static int pairdifference(int arr[], int x) {
    // for the first Number
    for (int i = 0; i < arr.length; i++) {
      // for the Second Number
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] - arr[i] == x) {
          System.out.println("YES!!");
          return 1;
        }
      }
    }
    System.out.println("NO!!"); // if not then print no.
    return -1;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the element of Array : ");
    inputArray(arr, size);
    System.out.print("Enter the Number x: ");
    int x = sc.nextInt();
    pairdifference(arr, x);
  }
}
