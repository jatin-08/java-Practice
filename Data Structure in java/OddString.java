// Convert the string {"ab", "bc", "cd", "de", "ef","fg", "gh"} into an array of string and print all string stored on odd indices  of the array.

import java.util.*;

public class OddString {

  // Creating a function inputArray that take input from the user.
  public static void inputArray(String arr[]) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextLine();
    }
  }

  // Creating a function printPositiveArray it gives the positive element of the array.
  public static void printOddString(String arr[]) {
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 != 0) {
        System.out.print(arr[i] + " ");
      }
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of the Array: ");
    int size = sc.nextInt();
    String arr[] = new String[size];
    System.out.print("Enter the values of the array: ");
    inputArray(arr);
    System.out.print("Printing the Odd String of the array: ");
    printOddString(arr);
  }
}
