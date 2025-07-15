class ListNode {
  int data;
  ListNode next;

  ListNode(int data) {
    this.data = data;
    this.next = null;
  }
}

public class palindrome {

  public static boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null)
      return true;

    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    ListNode secondHalf = reverse(slow);

    ListNode firstHalf = head;
    while (secondHalf != null) {
      if (firstHalf.data != secondHalf.data)
        return false;
      firstHalf = firstHalf.next;
      secondHalf = secondHalf.next;
    }

    return true;
  }

  public static ListNode reverse(ListNode head) {
    ListNode prev = null, curr = head;
    while (curr != null) {
      ListNode nextNode = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nextNode;
    }
    return prev;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(2);
    head.next.next.next.next = new ListNode(1);

    System.out.println("Is Palindrome? " + isPalindrome(head));
  }
}
