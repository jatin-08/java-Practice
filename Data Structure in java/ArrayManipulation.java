//  Pattern : Array Manipulation
// Note that only positive number are given in the array

import java.util.*;

public class ArrayManipulation {

  //  Find the Unique Number in a given array  where all the element are being repeated twice with one value being Unique
  public static int uniqueNumber(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          arr[i] = -1; //  the element which are twice are assigned to -1.
          arr[j] = -1; //  the element which are twice are assigned to -1.
        }
      }
    }
    int ans = -1;

    // Again we traversing the Array After changing the Value of this array to -1.
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        ans = arr[i];
      }
    }
    return ans;
  }

  // Creating a function scanArray that take input from the user
  public static void scanArray(int[] arr) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of Array : ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Give input element of Array : ");
    scanArray(arr);
    System.out.println(
      "The Unique Number from the Array is " + uniqueNumber(arr)
    );
    sc.close();
  }
}
