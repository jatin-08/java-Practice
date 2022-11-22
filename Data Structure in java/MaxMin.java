// Finding the Maximum and Minimum element from the Array

import java.util.*;

public class MaxMin {

  public static class Pair {

    int max;
    int min;
  }

  public static Pair getMinMax(int arr[], int size) {
    Pair minmax = new Pair();
    int i;

    //  If Array having only one element then min = max

    if (size == 1) {
      minmax.max = arr[0];
      minmax.min = arr[0];
    }

    // If Array having more than one element then,

    if (arr[0] > arr[1]) {
      minmax.max = arr[0];
      minmax.min = arr[1];
    } else {
      minmax.max = arr[1];
      minmax.min = arr[0];
    }

    // If Array having element more than 2 value then,

    for (i = 2; i < size; i++) {
      if (arr[i] > minmax.max) {
        minmax.max = arr[i];
      } else if (arr[i] < minmax.min) {
        minmax.min = arr[i];
      }
    }
    return minmax;
  }

  //Taking input from user

  public static void inputArray(int arr[], int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Give input element of Array :");
    inputArray(arr, size);
    Pair minmax = getMinMax(arr, size);
    System.out.printf("\nMinimum element is %d", minmax.min);
    System.out.printf("\nMaximum element is %d", minmax.max);
  }
}
