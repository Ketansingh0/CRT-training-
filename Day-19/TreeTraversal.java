
class Node {
  int data;
  Node left, right;

  Node(int item) {
    data = item;
    left = right = null;
  }
}

public class TreeTraversal {
  Node root;

  void preorder(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.data + " ");
    preorder(node.left);
    preorder(node.right);
  }

  void inorder(Node node) {
    if (node == null) {
      return;
    }
    inorder(node.left);
    System.out.print(node.data + " ");
    inorder(node.right);
  }

  void postorder(Node node) {
    if (node == null) {
      return;
    }
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.data + " ");
  }

  public static void main(String[] args) {
    TreeTraversal tree = new TreeTraversal();

    tree.root = new Node(7);
    tree.root.left = new Node(10);
    tree.root.right = new Node(8);
    tree.root.left.left = new Node(5);
    tree.root.left.right = new Node(4);
    tree.root.right.left = new Node(12);
    tree.root.right.right = new Node(16);
    tree.root.right.right.right = new Node(13);

    System.out.print("Preorder Traversal: ");
    tree.preorder(tree.root);
    System.out.println();

    System.out.print("Inroder Traversal: ");
    tree.inorder(tree.root);
    System.out.println();

    System.out.print("Postorder Traversal: ");
    tree.postorder(tree.root);
    System.out.println();
  }
}
