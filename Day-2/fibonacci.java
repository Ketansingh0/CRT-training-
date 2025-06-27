import java.util.Scanner;

public class fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n == 0) {
      System.out.println(0);
    } else {
      int a = 0;
      int b = 1;
      for (int i = 1; i <= n; i++) {
        System.out.print(" " + a);
        int temp = a + b;
        a = b;
        b = temp;
      }
      System.out.println();
    }
    sc.close();
  }
}
