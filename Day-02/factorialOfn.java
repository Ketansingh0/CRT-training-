import java.util.Scanner;
public class factorialOfn {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int factorial = 1;

    for (int i = 1; i <= n; i++) {
      factorial *= i;
    }

    System.out.println("Factorial of " + n + " is: " + factorial);
    sc.close();
  }
}
