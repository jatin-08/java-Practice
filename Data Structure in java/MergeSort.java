// Implementing Merge Sort Algorithm for sorting of array

import java.util.*;

public class MergeSort {

  // Creating an inputArray() -> It takes input from the user.
  public static void inputArray(int arr[], int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a printArray() -> It print the element of the Array.
  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Creating a merge() -> It merge the 2 sorted Array and return the final sorted array to mergeSort() function.
  // Time complexity -> T(n) = O(n)
  public static void merge(int arr[], int left, int mid, int right) {
    int size1 = mid - left + 1;
    int size2 = right - mid;
    int[] leftArr = new int[size1];
    int[] rightArr = new int[size2];
    int i, j, k;
    for (i = 0; i < size1; i++) {
      leftArr[i] = arr[left + i];
    }
    for (j = 0; j < size2; j++) {
      rightArr[j] = arr[mid + 1 + j];
    }
    i = 0;
    j = 0;
    k = left;

    while (i < size1 && j < size2) {
      if (leftArr[i] <= rightArr[j]) {
        arr[k] = leftArr[i];
        i++;
      } else {
        arr[k] = rightArr[j];
        j++;
      }
      k++;
    }

    while (i < size1) {
      arr[k] = leftArr[i];
      i++;
      k++;
    }
    while (j < size2) {
      arr[k] = rightArr[j];
      j++;
      k++;
    }
  }

  // Creating a mergeSort() ->  It return the Sorted by the approach of divide the array into 2 equal parts.
  // Time complexity -> T(n) = O(nlogn)  and Space complexity -> O(n)
  public static void mergeSort(int arr[], int left, int right) {
    // Base Case
    if (left >= right) return;
    int mid = (left + right) / 2;
    mergeSort(arr, left, mid);
    mergeSort(arr, mid + 1, right);
    merge(arr, left, mid, right);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array: ");
    int size = sc.nextInt();
    System.out.print("Enter the element of the Array: ");
    int left = 0;
    int right = size - 1;
    int arr[] = new int[size];
    inputArray(arr, size);
    System.out.print("Printing the element of the Array Before Sorted: ");
    printArray(arr);
    mergeSort(arr, left, right);
    System.out.print("Printing the element of the Array After Sorting: ");
    printArray(arr);
    sc.close();
  }
}
