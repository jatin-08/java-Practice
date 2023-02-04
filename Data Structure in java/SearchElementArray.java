// Finding  the  element is present is the Array using Linear Search and Binary Search

import java.util.*;

class SearchElementArray {

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

  // Creating a Linear Search function for finding the element is present is the Array or not .

  public static int linearSearch(int arr[], int size, int element) {
    for (int i = 0; i < size; i++) {
      if (arr[i] == element) {
        return i;
      }
    }
    return -1;
  }

  // Creating a Binary Search function for finding the element is present in the Array or not.

  public static int binarySearch(int arr[], int size, int element) {
    int low = 0;
    int high = size - 1;
    int mid = (low + high) / 2;
    while (low <= high) {
      if (arr[mid] == element) {
        return mid;
      } else if (arr[mid] < element) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Give input");
    inputArray(arr, size);
    System.out.println("Printing the element of Array!!");
    printArray(arr, size);
    System.out.println("Founding element by using Linear Search Method !!");
    System.out.println("Enter the element you want to find in the Array : ");
    int element = sc.nextInt();
    int indexofLinearSearch = linearSearch(arr, size, element);
    System.out.println("The " + element + " found at " + indexofLinearSearch);
    System.out.println("Founding element by using Binary Search Method !!");
    int indexofBinarySearch = binarySearch(arr, size, element);
    System.out.println("The " + element + " found at " + indexofBinarySearch);
    sc.close();
  }
}
