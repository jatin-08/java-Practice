/*  We have given a sorted array but 2 element are swapped and then we have to return the sorted Array in O(n) time.

input -> [3,8,6,7,5,9,10]
output ->[3,5,6,7,8,9,10]

*/

import java.util.*;

public class SortArray {

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

  // Creating a sortArray() -> It swap the conflict element to give the sorted array.
  public static void sortArray(int[] arr, int size) {
    int x = -1, y = -1;

    // Base Case

    if (size <= 1) {
      System.out.println("Please Enter the element at least more than 2!");
      return;
    }

    // Traversing the Array from 1 to size
    for (int i = 1; i < size; i++) {
      if (arr[i - 1] > arr[i]) {
        if (x == -1) { // 1st conflict
          x = i - 1;
          y = i;
        } else { // 2nd conflict
          y = i;
        }
      }
    }
    // Swapping the element of the Array that creat the conflict

    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
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
    sortArray(arr, size);
    System.out.print("After the removing the conflict: ");
    printArray(arr, size);
    sc.close();
  }
}
