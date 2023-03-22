/* 
   You have 'n' (n<=10^5)boxes of chocolate. Each box contain a[i]<=100000 chocolate. You need to distribute these
   boxes among 'm' student such that the maximum number of chocolate allocated to student is minimum.
   a) one box will be allocated to a student to exactly one student.
   b) All the boxes should be allocated.
   c) Each student has to be allocated at least one box.
   d) Alloment should be in contiguous order for instance a student cannot be allocated box1 and box3, skipping box2
   calculate and return the minimum possibe number.
   
   input: 4-> number of boxes
          12 34 67 90 -> number of chocolate in each boxes
          2-> number of student
    output: 113      
*/

import java.util.*;

public class ChocolateProblem {

  // Creating an inputArray() -> It takes input from the user
  public static void inputArray(int[] arr, int size) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  // Creating a printArray() -> It print the element of the Array.
  public static void printArray(int[] arr, int size) {
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Creating a isdistributionPossible() -> It will return true if possible otherwise return false.
  public static boolean isDivisionPossible(
    int[] arr,
    int size,
    int student,
    int maxChocolate
  ) {
    int numofstudent = 1;
    int chocolate = 0; // current chocolate given to current student.
    for (int i = 0; i < size; i++) {
      if (arr[i] > maxChocolate) {
        return false;
      }
      if (chocolate + arr[i] <= maxChocolate) {
        chocolate += arr[i]; 
      } else {
        numofstudent++;
        chocolate = arr[i];
      }
    }
    return numofstudent <= student;
  }

  // Creating a distributeChocolate() -> It will return minimal of the maximum.
  public static int distributeChocolate(int[] arr, int size, int student) {
    if (size < student) {
      return -1;
    }
    int ans = 0, st = 1, end = (int) 1e9;
    while (st <= end) {
      int mid = st + (end - st) / 2;
      if (isDivisionPossible(arr, size, student, mid)) {
        ans = mid;
        end = mid - 1;
      } else {
        st = mid + 1;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(
      "Enter the number of boxes of the chocolate avaiable for distribution: "
    );
    int size = sc.nextInt();
    System.out.print(
      "Enter the number of student are present for distribution: "
    );
    int student = sc.nextInt();
    int[] arr = new int[size];
    System.out.print(
      "Enter the number of chocolate present in the each boxes: "
    );
    inputArray(arr, size);
    System.out.println(
      "Printing the number of chocolate present in the each boxes"
    );
    printArray(arr, size);
    System.out.println(
      "The minimal distribution of chocolate boxes among each student: " +
      distributeChocolate(arr, size, student)
    );
    sc.close();
  }
}
