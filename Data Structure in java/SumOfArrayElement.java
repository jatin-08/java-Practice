// Calculating the sum of array element

import java.util.*;

class SumOfArrayElement {

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

  // Creating a function for finding sum of element of Array

  public static void sumofarray(int arr[], int size) {
    int sum = 0;
    for (int i = 0; i < size; i++) {
      sum = sum + arr[i];
    }
    System.out.println("Sum of element of Array is " + sum);
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
    System.out.println("Printing the sum of Array element");
    sumofarray(arr, size);
    sc.close();
  }
}
