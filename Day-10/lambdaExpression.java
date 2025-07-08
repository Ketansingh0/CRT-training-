@FunctionalInterface
interface Add {
  int sum(int a, int b);
}

public class lambdaExpression {
  public static void main(String[] args) {
    Add add = (a, b) -> a + b;
    System.out.println("Sum: " + add.sum(5, 3));
  }
}

// Functional Interface
// A Functional Interface is an interface that contains only one abstract
// method.
