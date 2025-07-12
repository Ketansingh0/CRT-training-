import java.util.*;

public class candies {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = 10;
    int k = 5;
    int purchase = sc.nextInt();
    if (purchase <= (N - k)) {
      System.out.println("Candies sold :" + purchase);
    } else {
      System.out.println("Invalid Input");
    }
  }
}
