// Write a program to sort an Array list of String in desecending order.

import java.util.*;

public class SortArrayList {

  public static void main(String args[]) {
    ArrayList<String> mylist = new ArrayList<String>();
    mylist.add("Jatin");
    mylist.add("Nitesh");
    mylist.add("Santosh");
    mylist.add("Priyanshu");
    System.out.println(mylist);
    Collections.sort(mylist, Collections.reverseOrder());
    System.out.println("Descending order list: " + mylist);
  }
}
