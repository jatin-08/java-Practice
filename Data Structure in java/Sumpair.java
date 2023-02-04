//  Find the total number of pairs in the Array whose sum is equal to the given number x.

import java.util.*;

public class Sumpair {

  // Creating a function pairSum that gives us output of that pair which have sum equal to the given number.
  public static int pairSum(int[] arr, int target) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          ans++;
        }
      }
    }
    return ans;
  }

  // Creating a function triplets it gives output of that triplets which have sum equal to the given number.
  public static int triplets(int[] arr, int target) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        for (int k = j + 1; k < arr.length; k++) {
          if (arr[i] + arr[j] + arr[k] == target) {
            ans++;
          }
        }
      }
    }
    return ans;
  }

  // Creating a function scanArray that take input from the user
  public static void scanArray(int[] arr) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of Array : ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Give input element of Array : ");
    scanArray(arr);
    System.out.print("Enter the target sum : ");
    int target = sc.nextInt();
    System.out.println(
      "The Given pair are formed by the Array are " + pairSum(arr, target)
    );
    System.out.println(
      "The Given triplets are formed by the Array are " + triplets(arr, target)
    );
    sc.close();
  }
}
