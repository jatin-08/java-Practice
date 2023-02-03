// Implementing Quick Sort for sorting the Array elements.

import java.util.*;

public class QuickSort {

  // Creating an inputArray() -> It takes input from the user.
  public static void inputArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println();
    sc.close();
  }

  // Creating a printArray() -> It print the element of the Array.
  public static void printArray(int[] arr, int size) {
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Creating a swap() -> It swap the element of the Array.
  public static void swap(int[] arr, int st, int end) {
    while (st < end) {
      int temp = arr[st];
      arr[st] = arr[end];
      arr[end] = temp;
      st++;
      end--;
    }
  }

  // Creating a partition() -> It return the pivot index for sorting the Array.
  // Time complexity -> T(n) = O(n)
  public static int partition(int[] arr, int st, int end) {
    int pivot = arr[st];
    int count = 0; // It will count how many element are smaller than pivot element.
    for (int i = st + 1; i <= end; i++) {
      if (arr[i] <= pivot) {
        count++;
      }
    }
    int pivotIdx = st + count;
    swap(arr, st, pivotIdx); // It will swap the first element of the Array from the pivot element.
    int i = st, j = end;
    while (i < pivotIdx && j > pivotIdx) {
      while (arr[i] <= pivot) {
        i++;
      }
      while (arr[j] > pivot) {
        j--;
      }
      if (i < pivotIdx && j > pivotIdx) {
        swap(arr, i, j);
        i++;
        j--;
      }
    }
    return pivotIdx;
  }

  // Creating a quickSort() -> It sort the Array by using quickSort Algorithm.
  // Time Complexity -> T(n) = O(n^2)  , space complexity -> O(n)
  public static void quickSort(int arr[], int st, int end) {
    if (st >= end) {
      return;
    }
    int pivot = partition(arr, st, end);
    quickSort(arr, st, pivot - 1);
    quickSort(arr, pivot + 1, end);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the element of the Array: ");
    inputArray(arr, size);
    System.out.print("Printing the element of the Array Before Sorting: ");
    printArray(arr, size);
    quickSort(arr, 0, size - 1);
    System.out.print("Printing the element of the Array After Sorting: ");
    printArray(arr, size);
    sc.close();
  }
}
