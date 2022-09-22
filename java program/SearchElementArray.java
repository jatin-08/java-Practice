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
  }

  // Creating a Linear Search function for finding the element is present is the Array or not .

  public static void linearSearch(int arr[], int size, int index) {
    for (int i = 0; i < size; i++) {
      if (index == arr[i]) {
        System.out.println(
          "Element found at " + index + " index in the Array!!"
        );
        break;
      }
    }
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
    int index = sc.nextInt();
    linearSearch(arr, size, index);
  }
}
