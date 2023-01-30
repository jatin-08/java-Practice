// Count the number of occurrence of a particular element.

import java.util.*;

public class OccuerenceOfNumber {

  // Creating a function scanArray for taking input from the user.
  public static void scanArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
  }

  // Creating a function printArray for printing the element of an Array.
  public static void printArray(int[] arr, int size) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
  }

  // Creating a function occurrenceofNumber which give us how many times a number is present in the array.
  public static int occurrenceofNumber(int arr[], int x) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        count++;
      }
    }
    return count;
  }

  // Creating a function lastoccurrence that gives us last occurence of a number
  public static int lastoccurrence(int arr[], int x) {
    int lastindex = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        lastindex = i;
      }
    }
    return lastindex;
  }

  // Creating a function greatestelement that gives us output how many number are greater element are present in the array.
  public static int greatestelement(int arr[], int x) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > x) {
        count++;
      }
    }
    return count;
  }

  //  Creating a function smallestlargestElement that gives us output the largest element and the smallest element from the sorted array
  // public static int[] smallestlargestElement(int arr[]) {
  //   // int[] ans = Arrays.sort(arr);
  //   return ans;
  // }

  public static void main(String args[]) {
    System.out.print("Enter the size of an Array : ");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Give Input : ");
    scanArray(arr, size);
    System.out.print("Give the element X : ");
    int x = sc.nextInt();
    System.out.print("Printing the element of the Array : ");
    printArray(arr, size);
    System.out.println();
    System.out.println("Count of X : " + occurrenceofNumber(arr, x));
    System.out.println("Last occurrence of X : " + lastoccurrence(arr, x));
    System.out.println(
      "How many times greater number occur :" + greatestelement(arr, x)
    );
    int []ans = smallestlargestElement(arr);
    System.out.println("Sorted array : "+ ans);
  }
}
