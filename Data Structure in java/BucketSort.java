// Implementing Bucket Sort for sorting the Array.

import java.util.*;

public class BucketSort {

  // Creating an inputArray() -> It takes input from the user.
  public static void inputArray(int[] arr, int size) {
    try (Scanner sc = new Scanner(System.in)) {
      for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
      }
    }
  }

  // Creating a printArray() -> It print the element of the Array.
  public static void printArray(int[] arr, int size) {
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Creating a bucketSort() -> It return the sorted Array by using the concept of the Bucket Sort Algorithm.
  public static void bucketSort(int[] arr, int size) {
    ArrayList<Integer>[] buckets = new ArrayList[size];
    // Creating empty buckets
    for (int i = 0; i < size; i++) {
      buckets[i] = new ArrayList<>(size);
    }

    // Add element into our buckets
    for (int i = 0; i < size; i++) {
      int bucketIdx = arr[i] % size;
      buckets[bucketIdx].add(arr[i]);
    }

    // Sorting individual buckets
    for (int i = 0; i < buckets.length; i++) {
      Collections.sort(buckets[i]);
    }

    // Merge all the buckets to get final sorted array
    int idx = 0;
    for (int i = 0; i < buckets.length; i++) {
      ArrayList<Integer> currentBucket = buckets[i];
      for (int j = 0; j < currentBucket.size(); j++) {
        arr[idx++] = currentBucket.get(j);
      }
    }
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the Size of the Array: ");
      int size = sc.nextInt();
      int[] arr = new int[size];
      System.out.print("Enter the elements of the array: ");
      inputArray(arr, size);
      System.out.print("Printing the elements of the Array Before Sorting: ");
      printArray(arr, size);
      bucketSort(arr, size);
      System.out.print("Printing the elements of the Array After Sorting: ");
      printArray(arr, size);
    }
  }
}
