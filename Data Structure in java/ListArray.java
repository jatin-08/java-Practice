// Creating a Array list and Using some method of the array list.

import java.util.ArrayList;

public class ListArray {

  public static void main(String args[]) {
    // Syntax of ArrayList
    ArrayList<Integer> l1 = new ArrayList<Integer>();
    // Adding a new element in Array list.
    l1.add(1); //  index = 0
    l1.add(2); // index = 1
    l1.add(3); // index = 2
    l1.add(4); // index = 3
    l1.add(5); // index = 4
    // get an element at index i -> listname.get(index)
    System.out.println(l1.get(2));
    // printing by using for loop. -> listname.size() : it give the size of the Array list.
    for (int i = 0; i < l1.size(); i++) {
      System.out.print(l1.get(i) + " ");
    }
    System.out.println();
    // printing the list directly.
    System.out.println(l1);
    // Adding element at some index i.
    l1.add(2, 6);
    System.out.println(l1);
    // Modifying element at index i. listname.set(index, element) -> it change that element on that index.
    l1.set(2, 7);
    System.out.println(l1);
    // remove an element index i. listname.remove(index) -> it remove the element that present on the given index.
    l1.remove(2);
    System.out.println(l1);
    // removing an element e when we don't no about index of that element.
    l1.remove(Integer.valueOf(5));
    System.out.println(l1);
    // Checking if the element is exist or not. listname.contain(object) -> it check if the element is present or not
    // boolean ans = l1.contains(Integer.valueOf(3));
    // if you don't specify class, you can put any thing inside list.
    ArrayList<String> l2 = new ArrayList<>();
    l2.add("Name:" + " " + "Jatin Yadav");
    l2.add("Rollno:" + " " + 16);
    l2.add("Fee:" + " " + 35000.80);
    System.out.println(l2);
    for (int i = 0; i < l2.size(); i++) {
      System.out.println(l2.get(i) + " ");
    }

    // Adding value at first index.
    l1.add(0, 0);
    System.out.println(l1);
  }
}
