// Printing the element of Array in the reverse order

import java.util.*;

class ReverseArray {

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

  // Creating a function for reversing the element of Array

  public static void reverseArray(int arr[], int start, int last) {
    int temp;
    while (start < last) {
      temp = arr[start];
      arr[start] = arr[last];
      arr[last] = temp;
      start++;
      last--;
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
    System.out.println("Printing the element of Array in the reverse order!!");
    reverseArray(arr, 0, size - 1);
    printArray(arr, size);
    sc.close();
  }
}
