// In this file all the important linked List question are present for the coding and interview round.

package LinkedList;

public class LinkedListInterviewQuesetion {

  // Creating a class Node
  public static class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  //  Ques 1) Find the Node from the last of the linked list anad you have given only head node?

  public static Node nthNodeFromLast(Node head, int idx) {
    int size = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      size++;
    }
    temp = head;
    int m = size - idx + 1;
    for (int i = 1; i < m; i++) {
      temp = temp.next;
    }
    return temp;
  }

  public static void main(String[] args) {
    Node a = new Node(100);
    Node b = new Node(13);
    Node c = new Node(4);
    Node d = new Node(5);
    Node e = new Node(12);
    Node f = new Node(10);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    Node temp = nthNodeFromLast(a, 6);
    System.out.println(temp.data);
  }
}
