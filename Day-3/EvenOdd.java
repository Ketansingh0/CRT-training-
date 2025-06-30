import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int EvenSum = 0;
    int OddSum = 0;

    for (int i = 0; i < n; i++) {
      if (arr[i] % 2 == 0) {
        EvenSum += arr[i];
      } else {
        OddSum += arr[i];
      }
    }
    System.out.println("Even number sum is " + EvenSum);
    System.out.println("Odd number sum is " + OddSum);
    sc.close();
  }
}
