import java.util.LinkedList;
import java.util.Queue;

class Node {
  int data;
  Node left, right;

  Node(int item) {
    data = item;
    left = right = null;
  }
}

public class LevelOrderTraversal {
  Node root;

  static void levelorder(Node root) {
    if (root == null)
      return;
    Queue<Node> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) {
      Node curr = q.poll();
      System.out.print(curr.data + " ");

      if (curr.left != null) {
        q.add(curr.left);
      }
      if (curr.right != null) {
        q.add(curr.right);
      }
    }
  }

  public static void main(String[] args) {
    Node root = new Node(7);
    root.left = new Node(10);
    root.right = new Node(8);
    root.left.left = new Node(5);
    root.left.right = new Node(4);
    root.right.left = new Node(12);
    root.right.right = new Node(16);
    root.right.right.right = new Node(13);

    System.out.print("Level-order traversal: ");
    levelorder(root);
  }
}
