// Calculating if Array containing Duplicate element or not.

import java.util.*;

public class Duplicate {

  // Creating the function InputArray for taking input for user

  public static void inputArray(int arr[], int size) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the element of Array : ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  public static boolean containsDuplicate(int arr[], int size) {
    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        if (arr[i] == arr[j]) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    inputArray(arr, size);
    if (containsDuplicate(arr, size)) {
      System.out.println("True!!");
    } else {
      System.out.println("False!!");
    }
    sc.close();
  }
}
