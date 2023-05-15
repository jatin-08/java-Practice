// In this file all the important linked List question are present for the coding and interview round.

package LinkedList;

import javax.xml.crypto.Data;

public class LinkedListInterviewQuesetion {

  // Creating a class Node
  public static class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  public static void displayLinkedList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "  ");
      temp = temp.next;
    }
    System.out.println();
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

  // Efficient approach for question 1st ?

  // Creating a nthNodeFromEnd() -> It will searches the element effeciently

  public static Node nthNodeFromEnd(Node head, int idx) {
    Node slow = head;
    Node fast = head;

    for (int i = 1; i <= idx; i++) {
      fast = fast.next;
    }

    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }
    return slow;
  }

  //  Ques 2) Removing Nth Node From the end of the linked list

  // Creating a removeNthNodeFromEnd() -> It will delete the node from the end of the linked list?

  public static Node removeNthNodeFromEnd(Node head, int idx) {
    Node slow = head;
    Node fast = head;

    for (int i = 1; i <= idx; i++) {
      fast = fast.next;
    }

    if (fast == null) {
      head = head.next;
      return head;
    }

    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }
    slow.next = slow.next.next;
    return head;
  }

  //  Ques3) Find the intersecting Node From the two linked list.

  // Creating an intersectionLinkedList() -> It will the common that is exist between them.

  public static Node intersectionLinkedList(Node head1, Node head2) {
    Node temp1 = head1;
    Node temp2 = head2;

    int count1 = 0, count2 = 0;

    // calculating the size of the 1st linked list
    while (temp1 != null) {
      temp1 = temp1.next;
      count1++;
    }

    // calculating the size of the 2nd linked list
    while (temp2 != null) {
      temp2 = temp2.next;
      count2++;
    }

    temp1 = head1;
    temp2 = head2;

    if (count1 >= count2) {
      int steps = count1 - count2;
      for (int i = 1; i <= steps; i++) {
        temp1 = temp1.next;
      }
    } else {
      int steps = count2 - count1;
      for (int i = 1; i <= steps; i++) {
        temp2 = temp2.next;
      }
    }

    while (temp1 != temp2) {
      temp1 = temp1.next;
      temp2 = temp2.next;
    }

    return temp1;
  }

  // Ques4) Finding the middle element of the linked list

  // Creating a middleOfLinkedList() -> It will return the middle node from the linked list

  public static Node middleOfLinkedList(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) { // it will return right middle of the linked list if it has even node
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  //  Creating a leftMiddleLinkedList() -> It will left node from the linked list is having even node

  public static Node leftMiddleLinkedList(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  // Ques5) Deleting the middle node from Linked List

  // Creating a deleteMiddleNode() -> It will delete the middle node from the linked list

  public static Node deleteMiddlNode(Node head) {
    if (head.next == null) {
      return null;
    }
    Node slow = head;
    Node fast = head;
    while (fast.next.next != null && fast.next.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    slow.next = slow.next.next;
    return head;
  }

  // Ques6) Checking if the cycle is present in the linked list or not.

  // Creating a hasCycle() -> It will return true if cycle exist or otherwise it return false

  public static boolean hasCycle(Node head) {
    if (head == null) {
      return false;
    }

    if (head.next == null) {
      return false;
    }
    Node slow = head;
    Node fast = head;
    while (fast != null) {
      if (slow == null) {
        return false;
      }
      slow = slow.next;
      if (fast.next == null) {
        return false;
      }
      fast = fast.next.next;
      if (fast == slow) {
        return true;
      }
    }
    return false;
  }

  // Ques7) Find the Node where Cycle form.

  // Creating a findCycleNode() -> It will return the Node where cycle form.
  public static Node findCylcNode(Node head) {
    if (head == null) {
      return head;
    }

    if (head.next == null) {
      return head;
    }
    Node slow = head;
    Node fast = head;
    while (fast != null) {
      if (slow == null) {
        return slow;
      }
      slow = slow.next;
      if (fast.next == null) {
        return fast;
      }
      fast = fast.next.next;
      if (fast == slow) {
        break;
      }
    }

    Node temp = head;

    while (temp != slow) {
      temp = temp.next;
      slow = slow.next;
    }
    return slow;
  }

  // Ques8) Merge two sorted linked lists

  // Creating a mergelinkedList() -> It will merge the two linked list
  public static Node mergelinkedList(Node head1, Node head2) {
    Node temp1 = head1;
    Node temp2 = head2;

    Node head = new Node(100);
    Node temp = head;

    while (temp1 != null && temp2 != null) {
      if (temp1.data <= temp2.data) {
        Node a = new Node(temp1.data);
        temp.next = a;
        temp = a;
        temp1 = temp1.next;
      } else {
        Node a = new Node(temp2.data);
        temp.next = a;
        temp = a;
        temp2 = temp2.next;
      }
    }

    if (temp1 == null) {
      temp.next = temp2;
    } else {
      temp.next = temp1;
    }
    return head.next;
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
    System.out.println("Printing the 1st linked list");
    displayLinkedList(a);

    /*

    Ans1)
    Node temp = nthNodeFromLast(a, 4);
    System.out.println(temp.data);

    System.out.println("This will work more effeciently ");

    Node temp2 = nthNodeFromLast(a, 4);
    System.out.println(temp2.data);

    */

    /*

    Ans2)
    System.out.println("Before Removing the element from the linked list");
    displayLinkedList(a);
    System.out.println("After Removing the element from the linked list");
    a = removeNthNodeFromEnd(a, 6);
    displayLinkedList(a);

    */

    /*

    Ans3)
    Node a1 = new Node(90);
    a1.next = d;
    d.next = e;
    e.next = f;

    System.out.println("Printing the 2nd linked list");
    displayLinkedList(a1);
    
    */

    /* 
    
    Ans4)
    Node temp = intersectionLinkedList(a, a1);
    System.out.println("Printing the intersection node: " + temp.data);
    Node temp = leftMiddleLinkedList(a);
    System.out.println("The middle node of the linked list: " + temp.data);
    
    */

    /*

    Ans5)
    System.out.println("Deleting Node from the from linked list: ");
    a = deleteMiddlNode(a);
    displayLinkedList(a);

    */

    // Ans6)
    //   if (hasCycle(a)) {
    //     System.out.println("Cycle exist");
    //   } else {
    //     System.out.println("Cycle doesnot exist");
    //   }

    // Ans7)
    // Node temp = findCylcNode(a);
    // System.out.println("The Cycle Node: " + temp.data);

    Node a1 = new Node(2);
    Node b1 = new Node(4);
    Node c1 = new Node(6);
    Node d1 = new Node(7);
    Node e1 = new Node(11);
    Node f1 = new Node(15);
    a1.next = b1;
    b1.next = c1;
    c1.next = d1;
    d1.next = e1;
    e1.next = f1;

    System.out.println("Printing the 2nd linked list: ");
    displayLinkedList(a1);

    System.out.println("After merging the linked list: ");
    Node temp = mergelinkedList(a, a1);
    displayLinkedList(temp);
  }
}
