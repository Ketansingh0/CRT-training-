public class StackImplement {
  int[] arr;
  int top;
  int capacity;

  StackImplement(int capacity) {
    this.capacity = capacity;
    top = -1;
    arr = new int[capacity];
  }

  void push(int data) {
    if (top == capacity - 1) {
      throw new RuntimeException("Stack is full");
    }
    top++;
    arr[top] = data;
  }

  int pop() {
    if (top == -1) {
      throw new RuntimeException("Stack is empty");
    }
    int result = arr[top];
    top--;
    return result;
  }

  int peek() {
    if (top == -1) {
      throw new RuntimeException("Stack is empty");
    }
    return arr[top];
  }

  int size() {
    return top + 1;
  }

  boolean isEmpty() {
    return top == -1;
  }

  public static void main(String[] args) {
    StackImplement stack = new StackImplement(5);
    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.println("Top element is: " + stack.peek());

    System.out.println("Popped element is: " + stack.pop());

    System.out.println("Current stack size: " + stack.size());

    System.out.println("Is stack empty? " + stack.isEmpty());

    System.out.println("Popped element is: " + stack.pop());
    System.out.println("Popped element is: " + stack.pop());

    System.out.println("Is stack empty? " + stack.isEmpty());
  }
}
