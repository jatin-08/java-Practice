// Convert the list of Strings into an array of strings and print all string stored on odd indices of the array.

import java.util.*;

public class OddNumber {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int size = sc.nextInt();
    String[] arr = new String[size];
    System.out.print("Enter the Value in the array : ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.next();
    }
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 != 0) {
        System.out.println("Odd index value of Array : "+arr[i]);
      }
    }
  }
}
