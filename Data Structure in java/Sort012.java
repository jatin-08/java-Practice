/*
Write a program to sort the given number and number present in the array are only 0,1,2.
We have to sort in linear timne.It is also called as Duch National Flag Problem.

input -> [1,2,0,1,0,0]
output -> [0,0,0,1,1,2]

*/

import java.util.*;

public class Sort012 {

  // Creating a inputArray() -> It takes input from the user
  public static void inputArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a printArray() -> It print the element of the Array
  public static void printArray(int arr[], int size) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  // Creating a sort012() -> It sort the given number by using the concept of the count sort algorithm.
  // It solve by using 3phases. T(n) -> O(n)
  public static void sort012(int arr[], int size) {
    int count_0 = 0, count_1 = 0, count_2 = 0;
    for (int i : arr) {
      if (i == 0) {
        count_0++;
      } else if (i == 1) {
        count_1++;
      } else {
        count_2++;
      }
    }
    int k = 0;
    while (count_0 > 0) {
      arr[k++] = 0;
      count_0--;
    }
    while (count_1 > 0) {
      arr[k++] = 1;
      count_1--;
    }
    while (count_2 > 0) {
      arr[k++] = 2;
      count_2--;
    }
  }

  // Creating a swap() -> It swap the numbers of the array.
  public static void swap(int[] arr, int st, int lt) {
    int temp = arr[st];
    arr[st] = arr[lt];
    arr[lt] = temp;
  }

  // Creating a sort012By2ndApproach () -> It sort the 012 in his correct order in the linear time and 1phase also.
  public static void sort012By2ndApproach(int arr[], int size) {
    int lo = 0, mid = 0, hi = size - 1;

    // Explore the unkown region
    while (mid <= hi) {
      if (arr[mid] == 0) {
        swap(arr, mid, lo);
        lo++;
        mid++;
      } else if (arr[mid] == 1) {
        mid++;
      } else {
        swap(arr, mid, hi);
        hi--;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the element of the Array: ");
    inputArray(arr, size);
    System.out.print("Printing the element of the Array Before Sorted: ");
    printArray(arr, size);
    sort012(arr, size);
    System.out.print("Sorting the 012 element: ");
    printArray(arr, size);
    sort012By2ndApproach(arr, size);
    System.out.print("Sorting the 012 element By 2nd Approach: ");
    printArray(arr, size);
    sc.close();
  }
}
