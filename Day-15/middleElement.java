
public class middleElement {
  static Node head;

  static Node findMid(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public static void main(String[] args) {
    Node var1 = new Node(10);
    Node var2 = new Node(20);
    Node var3 = new Node(30);
    Node var4 = new Node(40);
    Node var5 = new Node(50);
    head = var1;
    var1.next = var2;
    var2.next = var3;
    var3.next = var4;
    var4.next = var5;
    var5.next = null;

    System.out.println(findMid(head).data);
  }
}
