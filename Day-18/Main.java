class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class QueueImplement {
  Node front, rear;

  QueueImplement() {
    front = rear = null;
  }

  // Enqueue operation
  void enqueue(int data) {
    Node newNode = new Node(data);

    // If queue is empty
    if (rear == null) {
      front = rear = newNode;
      return;
    }

    // Add the new node at the end of the queue and change rear
    rear.next = newNode;
    rear = newNode;
  }

  // Dequeue operation
  int dequeue() {
    // If queue is empty
    if (front == null) {
      System.out.println("Queue is empty");
      return -1;
    }

    int result = front.data;
    front = front.next;

    // If front becomes null, then rear should also be null
    if (front == null)
      rear = null;

    return result;
  }

  // Peek operation
  int peek() {
    if (front == null) {
      System.out.println("Queue is empty");
      return -1;
    }
    return front.data;
  }

  // Check if queue is empty
  boolean isEmpty() {
    return front == null;
  }

  // Display the queue
  void display() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return;
    }

    Node temp = front;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }
}

// Main class to test the Queue
public class Main {
  public static void main(String[] args) {
    QueueImplement q = new QueueImplement();

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.display(); // Output: 10 20 30

    System.out.println("Dequeued: " + q.dequeue()); // Output: 10
    q.display(); // Output: 20 30

    System.out.println("Front element: " + q.peek()); // Output: 20
  }
}
