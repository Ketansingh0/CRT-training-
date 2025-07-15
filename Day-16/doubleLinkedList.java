class listNode {
  int data;
  listNode next;
  listNode prev;

  listNode(int data) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}

public class doubleLinkedList {
  static listNode head;

  public static void main(String[] args) {
    insert(10);
    insert(15);
    insert(12);
    displayForward();
    displayBackward();
  }

  static void insert(int data) {
    listNode newNode = new listNode(data);
    if (head == null) {
      head = newNode;
      return;
    }
    listNode temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
    newNode.prev = temp;
  }

  static void displayForward() {
    listNode temp = head;
    System.out.println("forward");
    System.out.print("null" + " ");
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  static void displayBackward() {
    listNode temp = head;
    if (temp == null)
      return;

    while (temp.next != null) {
      temp = temp.next;
    }

    System.out.println("Backward: ");
    System.out.print("null" + " ");
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.prev;
    }
    System.out.println("null");
  }
}
