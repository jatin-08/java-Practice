// Write a program to insert an element into the given arrayList of size n at any index.

import java.util.*;

public class InsertAtFirst {

  // Creating a function inputArrayList that takes input from user.
  public static void inputArrayList(ArrayList<Integer> number, int n) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      number.add(sc.nextInt());
    }
    sc.close();
  }

  // Creating a function printArrayList that print element of the ArrayList.
  public static void printArrayList(ArrayList<Integer> number) {
    for (int i = 0; i < number.size(); i++) {
      System.out.print(number.get(i) + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of ArrayList: ");
    int n = sc.nextInt();
    ArrayList<Integer> number = new ArrayList<Integer>();
    System.out.println("Enter the element in the Array List: ");
    inputArrayList(number, n);
    System.out.print("Enter the index: ");
    int index = sc.nextInt();
    System.out.print("Enter the element: ");
    int element = sc.nextInt();
    System.out.println("Printing the element of the Array List Before Add: ");
    printArrayList(number);
    number.add(index, element);
    System.out.print("After Adding the element in the Array List: ");
    printArrayList(number);
    System.out.print("Enter the index that you want to delete: ");
    int rem = sc.nextInt();
    number.remove(rem);
    printArrayList(number);
    System.out.print("Enter the indices to swap the element: ");
    int i = sc.nextInt();
    int j = sc.nextInt();
    int temp = number.get(i);
    Collections.swap(number, i, j);
    System.out.print("After Swap : ");
    printArrayList(number);
    sc.close();
  }
}
