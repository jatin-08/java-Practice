// Write a program to Reverse the given ArrayList.

import java.util.*;

public class ReverseArrayList {

  // Creating a function reverseArrayList that reverse the given list .
  public static void reverseArrayList(ArrayList<Integer> revlist) {
    int i = 0, j = revlist.size() - 1;
    while (i < j) {
      Integer temp = Integer.valueOf(revlist.get(i)); //  temp = arr[i]
      revlist.set(i, revlist.get(j)); // arr[i] = arr[j]
      revlist.set(j, temp); // arr[j] = temp
      i++;
      j--;
    }
    System.out.println("The Reverse Array List: " + revlist);
  }

  public static void main(String args[]) {
    ArrayList<Integer> revlist = new ArrayList<Integer>();
    revlist.add(1);
    revlist.add(2);
    revlist.add(3);
    revlist.add(4);
    revlist.add(5);
    System.out.println("The Original Array list: " + revlist);
    // reverseArrayList(revlist);
    Collections.reverse(revlist); // Collection.reverse(listname) -> it reverse the given array list.
    System.out.println("The reverse Array list by using Reverse(): " + revlist);
    // Collections.sort(listname) -> it sort the given array list in ascending order by default.
    Collections.sort(revlist);
    System.out.println("The Ascending order sorted list: " + revlist);
    // Collecions.reverseOrder() -> it reverse the natural ordering of the list.
    Collections.sort(revlist, Collections.reverseOrder());
    System.out.println("The Descending order sorted list: " + revlist);
  }
}
