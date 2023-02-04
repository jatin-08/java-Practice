// Finding the Second largest element from the given Array .

import java.util.*;

public class SecondLargest {

  // Creating a function for taking input

  public static void inputArray(int arr[], int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a function MaxNumber that gives output the largest Number in the Array.
  public static int MaxNumber(int arr[]) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  // Creating a function secondLargest that gives output the Second largest Number from the Array.
  public static int secondLargest(int arr[]) {
    int max = MaxNumber(arr);
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == max) {
        arr[i] = Integer.MIN_VALUE;
      }
    }
    int secondlargest = MaxNumber(arr);
    return secondlargest;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the element of Array : ");
    inputArray(arr, size);
    System.out.println("The largest Number of the Array is " + MaxNumber(arr));
    System.out.println(
      "The Second Largest Number of the Array is " + secondLargest(arr)
    );
    sc.close();
  }
}
