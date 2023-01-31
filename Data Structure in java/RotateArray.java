// Rotate the given array "a" by k steps , where k is non-negative
// Note: K can be greater than n as well.

import java.util.*;

public class RotateArray {

  // Printig the element of the Array

  public static void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  //Taking input from user

  public static void inputArray(int arr[], int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Reversing the array without using any other array.

  public static void reverseArray(int[] arr, int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  // Creating a rotateArray function that rotate the array by using the external array.

  public static int[] rotateArray(int[] arr, int rotate) {
    int size = arr.length;
    rotate = rotate % size;
    int[] ans = new int[size];
    int j = 0;

    // for rotation of array
    for (int i = size - rotate; i < size; i++) {
      ans[j++] = arr[i];
    }

    // for remaining array element
    for (int i = 0; i < size - rotate; i++) {
      ans[j++] = arr[i];
    }
    return ans;
  }

  // Creating a function rotateInArray it rotate the array without using the other Array.

  public static void rotateInArray(int[] arr, int rotate) {
    rotate = rotate % arr.length;
    reverseArray(arr, 0, arr.length - rotate - 1); // Reversing the 1st half of the array
    reverseArray(arr, arr.length - rotate, arr.length - 1); // Reversing the 2nd half of the array
    reverseArray(arr, 0, arr.length - 1); // Reversing the whole array
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int size = sc.nextInt();
    System.out.print(
      "Enter the value how much time you want to rotate the array: "
    );
    int rotate = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Give input");
    inputArray(arr, size);
    System.out.println("Printing the element of Array!!");
    printArray(arr, size);
    int[] ans = rotateArray(arr, rotate);
    System.out.print("Array after Rotation [Using an external array]");
    printArray(ans, size);
    System.out.print("Array after Rotation [Without using external array]");
    rotateInArray(arr, rotate);
    printArray(arr, size);
    sc.close();
  }
}
