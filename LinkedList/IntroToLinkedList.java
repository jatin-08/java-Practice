package LinkedList;

public class IntroToLinkedList {

  // Creating a displayLinkedList() -> It print the element of the list.
  public static void displayLinkedList(Node head) {
    while (head != null) {
      System.out.println(head.data + "  ");
      head = head.next;
    }
  }

  // Creating displayLinkedListReverse() -> It will reverse the given linked list
  public static void displayLinkedListReverse(Node head) {
    if (head == null) {
      return;
    }
    displayLinkedListReverse(head.next);
    System.out.print(head.data + "  ");
  }

  // Creating a findLengthLL() -> It will return the length of the given linked list
  public static int findLengthLL(Node head) {
    int i = 0;
    while (head != null) {
      i++;
      head = head.next;
    }
    return i;
  }

  public static class Node {

    int data; // Value
    Node next; //  address of the next node

    Node(int data) {
      this.data = data;
    }
  }

  public static void main(String[] args) {
    Node nd1 = new Node(5);
    Node nd2 = new Node(6);
    Node nd3 = new Node(1);
    nd1.next = nd2;
    nd2.next = nd3;
    System.out.println("Printing the linked list");
    displayLinkedList(nd1);
    System.out.println("Printing the linked list in the reverse order");
    displayLinkedListReverse(nd1);
    System.out.println();
    System.out.println("The length of the linked list: "+findLengthLL(nd1)); 
  }
}
