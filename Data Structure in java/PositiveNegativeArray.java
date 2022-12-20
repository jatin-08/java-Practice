import java.util.*;

public class PositiveNegativeArray {

  // Creating a function inputArray for taking input from the user.

  public static void inputArray(int arr[]) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
  }

  // Creating a function printArray for Printing the element of the array.

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Creating positiveNegativeArray function it gives the positive element at 1st then print the negative element.
  public static int[] positiveNegativeArray(int arr[]) {
    int size = arr.length;
    int ans[] = new int[size];
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= 0) {
        ans[count] = arr[i];
        count++;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        ans[count] = arr[i];
        count++;
      }
    }
    return ans;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the element of Array : ");
    inputArray(arr);
    System.out.println("Printing the element of Array: ");
    printArray(arr);
    System.out.println("1st positive element then -ve number: ");
    int ans[] = positiveNegativeArray(arr);
    printArray(ans);
  }
}
