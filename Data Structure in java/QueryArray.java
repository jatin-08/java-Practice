// Given Q Queries, check if the given number is present in the array or not
// Note: Value of all the element in the array is less than 10^5.

import java.util.*;

class QueryArray {

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

  // Creating a makeFrequencyArray function
  public static int[] makeFrequencyArray(int arr[]) {
    int[] freq = new int[100005];
    for (int i = 0; i < arr.length; i++) {
      freq[arr[i]]++;
    }
    return freq;
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
    int[] freq = makeFrequencyArray(arr);
    System.out.print("Enter the Query want to search: ");
    int queries = sc.nextInt();

    // code for queries matching
    while (queries > 0) {
      System.out.print("Enter the number you want to search: ");
      int x = sc.nextInt();
      if (freq[x] > 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
      queries--;
    }
  }
}
