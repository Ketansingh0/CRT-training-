import java.util.Scanner;
public class primeNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // boolean isPrime = true;
    // for (int i = 2; i <= Math.sqrt(n); i++) {
    //   if (n % i == 0) {
    //     isPrime = false;
    //     break;
    //   }
    // }
    // if(isPrime){
    //   System.out.println("prime number");
    // }else{
    //   System.out.println("Not a prime number");
    // }

    int c = 2;
    boolean isPrime = true;
    while (c * c <= n) {
      if (n % c == 0) {
        isPrime = false;
        break;
      }
      c++;
    }
    if (n <= 1) {
      System.out.println(n + " is not a prime number");
    } else if (isPrime) {
      System.out.println(n + " is a prime number");
    } else {
      System.out.println(n + " is not a prime number");
    }
    sc.close();
  }
}
