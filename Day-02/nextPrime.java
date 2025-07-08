import java.util.Scanner;

public class nextPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    int nextPrime = n + 1;

    // while (true) {
    // boolean isPrime = true;
    // for (int i = 2; i <= Math.sqrt(nextPrime); i++) {
    // if (nextPrime % i == 0) {
    // isPrime = false;
    // break;
    // }
    // }
    // if (isPrime) {
    // System.out.println("Next prime is: " + nextPrime);
    // break;
    // }
    // nextPrime++;
    // }

    while (true) {
      if (isPrime(nextPrime)) {
        System.out.println(nextPrime);
        break;
      }
      nextPrime++;
    }
    sc.close();
  }

  private static boolean isPrime(int num) {
    if (num < 2)
      return false;
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0)
        return false;
    }
    return true;
  }
}
