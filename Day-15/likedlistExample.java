import java.util.*;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }
}

public class likedlistExample {
  static Node head;

  public static void main(String[] args) {
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(30);
    Node n4 = new Node(40);
    Node n5 = new Node(50);

    head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = null;

    print(head);

    insertAtEnd(60);
    print(head);

    insertAtBeginning(5);
    print(head);

    print(reverse(head));
  }

  static void print(Node head) {
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.data + " -> ");
      curr = curr.next;
    }
    System.out.println("null");
  }

  static void insertAtEnd(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }

    Node curr = head;
    while (curr.next != null) {
      curr = curr.next;
    }
    curr.next = newNode;
  }

  static void insertAtBeginning(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  static Node reverse(Node head) {
    Node prev = null;
    Node curr = head;

    while (curr != null) {
      Node next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }
}