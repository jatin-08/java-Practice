// Return the first value that is repeating in the array.

import java.util.*;

public class FirstRepeat {

  // Creating a function inputArray for taking input from the user.

  public static void inputArray(int arr[], int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
  }

  // Creating a function firstRepeatNumber it give the output of the first repeated number in the Array.
  public static int firstRepeatNumber(int arr[]) { 
    // for first number 
    for (int i = 0; i < arr.length; i++) {
      // for second number  
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          return arr[i];
        }
      }
    }
    return -1; // if there are all unique number then it return -1.
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the element of Array : ");
    inputArray(arr, size);
    System.out.println(
      "The first repeated Number in the Array is " + firstRepeatNumber(arr)
    );
  }
}
