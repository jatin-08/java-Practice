package LinkedList;

public class IntroToLinkedList {

  // Creating a displayLinkedList() -> It print the element of the list.
  public static void displayLinkedList(Node head) {
    System.out.println(
      "Printing the element of the linked list using While Loop"
    );
    while (head != null) {
      System.out.println(head.data + "  ");
      head = head.next;
    }
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

    displayLinkedList(nd1);
  }
}
