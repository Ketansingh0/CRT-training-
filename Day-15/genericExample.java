class listNode<T> {
  T data;
  listNode next;

  listNode(T data) {
    this.data = data;
    this.next = null;
  }
}

public class genericExample {
  public static void main(String[] args) {
    // listNode head;
    listNode<Integer> n1 = new listNode<>(10);
    listNode<Integer> n2 = new listNode<>(15);
    listNode<String> n3 = new listNode<>("Ketan");
    listNode<Character> n4 = new listNode<>('a');

    // head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = null;
    // print(head);
  }

  static <T> void print(listNode<T> head) {
    listNode<T> curr = head;
    while (curr != null) {
      System.out.print(curr.data + " -> ");
      // curr = curr.next;
    }
    System.out.println("null");
  }
}
