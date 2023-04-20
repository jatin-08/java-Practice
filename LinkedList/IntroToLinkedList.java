package LinkedList;

public class IntroToLinkedList {

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
  }
}
