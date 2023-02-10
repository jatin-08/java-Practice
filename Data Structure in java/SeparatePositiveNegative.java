/* 
Given an array of positive and negative , separate them in linear time and constant space.
The output should printall  negative number , followed by the positive number.
   
input-> [2,-1,4,-3,5]
output-> [-1,-3,2,4,5]

 */

import java.util.Scanner;

public class SeparatePositiveNegative {

  // Creating an inputArray() -> It takes input from the user.
  public static void inputArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a printArray() -> It print the element of the Array.
  public static void printArray(int[] arr, int size) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  // Creating a separatePositiveNegative() -> It will arrange the negative number in starting and positive number in the end.
  public static void separatePositiveNegative(int[] arr, int size) {
    int left = 0, right = size - 1;
    while (left < right) {
      while (arr[left] < 0) {
        left++;
      }
      while (arr[right] >= 0) {
        right--;
      }
      if (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the element of the Array: ");
    inputArray(arr, size);
    System.out.print("Printing the Array Before Swapping: ");
    printArray(arr, size);
    separatePositiveNegative(arr, size);
    System.out.println("Sorting the Array 1st negative and then positive: ");
    printArray(arr, size);
    sc.close();
  }
}
