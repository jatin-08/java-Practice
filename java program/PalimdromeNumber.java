//  Printing the Palimdrome Number

import java.util.*;

class PalimdromeNumber {

  // Creating a inputArray -> It take input from the user.
  public static void inputArray(int[] arr) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a isPalindrome -> It return true if palindrome number exit or other wise return false.
  public static boolean isPalindrome(int[] arr, int leftIdx, int rightIdx) {
    if (leftIdx >= rightIdx) {
      return true;
    }
    return (
      arr[leftIdx] == arr[rightIdx] &&
      isPalindrome(arr, leftIdx + 1, rightIdx - 1)
    );
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number! : ");
    int n = sc.nextInt();
    int rem, sum = 0;
    int temp;
    temp = n;
    while (n > 0) {
      rem = n % 10;
      sum = (sum * 10) + rem;
      n /= 10;
    }
    if (temp == sum) {
      System.out.println("The given Number is Palindrome Number!!");
    } else {
      System.out.println("The given Number is not a Palindrome Number!!");
    }
    System.out.print("Enter the size of the Array: ");
    int size = sc.nextInt();
    System.out.print("Enter the element of the Array: ");
    int[] arr = new int[size];
    inputArray(arr);
    System.out.println(
      "If palindrome exist(TRUE) or Otherwise (FALSE): " +
      isPalindrome(arr, 0, size - 1)
    );
    sc.close();
  }
}
