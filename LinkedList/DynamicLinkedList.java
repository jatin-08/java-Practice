package LinkedList;

public class DynamicLinkedList {

  // Creating a class Node
  public static class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  // Creating class Linked List
  public static class LinkedList {

    Node head = null;
    Node tail = null;

    // Creating a insertAtStart() -> It will insert the node at the start of the linked list
    void insertAtStart(int value) {
      Node temp = new Node(value);
      if (head == null) {
        head = tail = temp;
      } else {
        temp.next = head;
        head = temp;
      }
    }

    // Creagting a insertAtEnd() -> It will insert the node at the end of the linked list
    void insertAtEnd(int value) {
      Node temp = new Node(value);
      if (head == null) {
        head = temp;
      } else {
        tail.next = temp;
      }
      tail = temp;
    }

    // Creating an insertAtIndex() -> It will insert the node at the given index in the linked list.
    void insertAtIndex(int val, int index) {
      Node t = new Node(val);
      Node temp = head;
      if (index == size()) {
        insertAtEnd(val);
        return;
      }
      if (index == 0) {
        insertAtStart(val);
        return;
      }
      for (int i = 1; i <= index - 1; i++) {
        temp = temp.next;
      }
      t.next = temp.next;
      temp.next = t;
    }

    // Creating a display() -> It is used to display the element of the linked list

    void display() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + "  ");
        temp = temp.next;
      }
      System.out.println();
    }

    // Creating a size() -> It print the size of the linked list
    int size() {
      int count = 0;
      Node temp = head;
      while (temp != null) {
        count++;
        temp = temp.next;
      }
      return count;
    }
  }

  // creating a main function
  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    System.out.println("Printing the element of the linked list");
    ll.insertAtEnd(2);
    ll.insertAtEnd(5);
    ll.insertAtStart(4);
    ll.insertAtStart(1);
    ll.insertAtStart(6);
    ll.insertAtIndex(2, 4);
    ll.display();
    System.out.println("The size of the linked list: " + ll.size());
    ll.insertAtIndex(10, 0);
  }
}