import java.util.Scanner;
public class nOddNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    // System.out.println("Odd numbers from 1 to " + n + ":");
    // for (int i = 1; i <= n; i++) {
    //   if (i % 2 != 0) {
    //     System.out.println(i);
    //   }
    // }
    int count = 0;
    int num = 1;
    while (count < n) {
      System.out.println(num);
      num += 2;
      count++;
    }
    sc.close();
  }
}
