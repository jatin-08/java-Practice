// Calculate that the element of Array are equal or not.

import java.util.*;

public class EqualArray {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int size = sc.nextInt();
    boolean ans = true;
    int[] arr_1 = new int[size];
    System.out.print("Enter the element of Array1 : ");

    // Taking input of element from Array_1
    for (int i = 0; i < arr_1.length; i++) {
      arr_1[i] = sc.nextInt();
    }
    int[] arr_2 = new int[size];
    System.out.print("Enter the element of Array2 : ");

    // Taking input of element from Array_2
    for (int i = 0; i < arr_2.length; i++) {
      arr_2[i] = sc.nextInt();
    }

    // Comparing the Arrays from element
    for (int i = 0; i < size; i++) {
      if (arr_1[i] != arr_2[i]) {
        ans = false;
        break;
      }
    }
    System.out.print(ans);
  }
}
