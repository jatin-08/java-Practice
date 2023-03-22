/* 
  A new racing track for kid is build in the new york wiht 'n' starting spots. The spot are located along a straight
  line at position x1, x2,..., xn(xi <= 10^9). for each 'i', xi + 1 > xi.
  
  At a time only 'm' student are allowed to enter in the race. Since the race track is for kids, they may run into
  each other while running. To prevent this, we want to chose the starting spots such that the minimum distance between
  any two kids it as a large as possible. What is the largest minimum distance.

  input: 5-> the number of starting spots.
         1 2 3 4 5-> location of each spots.
         3 -> number of student
  output: 3 -> minimum distance
*/

import java.util.Scanner;

public class KidRaceProblem {

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

  // Creating a isDistancePossible() -> It will return true if possible otherwise return false.
  public static boolean isDistancePossible(
    int[] arr,
    int size,
    int student,
    int largestDistance
  ) {
    int kidsPlaced = 1;
    int lastkid = arr[0]; // current chocolate given to current student.
    for (int i = 0; i < size; i++) {
      if (arr[i] - lastkid >= largestDistance) {
        kidsPlaced++;
        lastkid = arr[i]; 
      }
    }
    return kidsPlaced >= student;
  }

  // Creating a raceTrack() -> It will return maximal of the minimal.
  public static int raceTrack(int[] arr, int size, int student) {
    if (size < student) {
      return -1;
    }
    int ans = 0, st = 1, end = (int) 1e9;
    while (st <= end) {
      int mid = st + (end - st) / 2;
      if (isDistancePossible(arr, size, student, mid)) {
        ans = mid;
        st = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of starting spots for kids: ");
    int size = sc.nextInt();
    System.out.print("Enter the number of kid are present for the race: ");
    int student = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the location of each spots: ");
    inputArray(arr, size);
    System.out.println("Printing the location of the each spots: ");
    printArray(arr, size);
    System.out.println(
      "The largest distance between kids: " + raceTrack(arr, size, student)
    );
    sc.close();
  }
}
