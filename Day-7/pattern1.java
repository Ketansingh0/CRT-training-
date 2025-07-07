import java.util.Scanner;

public class pattern1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n / 2 + 1; i++) {
      // for space
      for (int j = 0; j < (n / 2 + 1) - i - 1; j++) {
        System.out.print(" ");
      }
      // for stars
      for (int j = 0; j < 2 * i + 1; j++) {
        if (n % 2 == 0) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
