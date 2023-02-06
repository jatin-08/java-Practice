// Implementing Radix sort.

import java.util.Scanner;

public class RadixSort {

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
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Creating a findMax() -> It return the max element from the Array.
  public static int findMax(int[] arr, int size) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < size; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    return max;
  }

  // Creating a countSort() -> It return the output arr.
  public static void countSort(int[] arr, int place, int size) {
    int[] output = new int[size];
    int[] count = new int[10];
    for (int i = 0; i < size; i++) {
      count[(arr[i] / place) % 10]++;
    }

    // Making a prefixsum array of count array.
    for (int i = 1; i < count.length; i++) {
      count[i] += count[i - 1];
    }
    for (int i = size - 1; i >= 0; i--) {
      int idx = count[(arr[i] / place) % 10] - 1;
      output[idx] = arr[i];
      count[(arr[i] / place) % 10]--;
    }

    // copy all the element of the output array in the arr array.
    for (int i = 0; i < size; i++) {
      arr[i] = output[i];
    }
  }

  // Creating a radixSort() -> It return the sorted Array by using Radix Sort
  // Time Complexity -> T(n)= O(nk) and spce complexity -> O(n + K) where is the how many time place loop runs.
  public static void radixSort(int[] arr, int size) {
    int max = findMax(arr, size);
    // Apply countsort to sort the element based on place value
    for (int place = 1; max / place > 0; place *= 10) {
      countSort(arr, place, size);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of the Array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the element of the array: ");
    inputArray(arr, size);
    System.out.print("Printing the element of the Array Before Sorting: ");
    printArray(arr, size);
    radixSort(arr, size);
    System.out.print("Printing the element of the Array After Sorting: ");
    printArray(arr, size);
    sc.close();
  }
}
