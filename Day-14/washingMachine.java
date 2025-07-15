import java.util.*;

public class washingMachine {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int val = sc.nextInt();
    if (val == 0) {
      System.out.println("Time estimated: 0 minutes");
    } else if (val <= 2000) {
      System.out.println("Time estimated: 25 minutes");
    } else if (val <= 4000) {
      System.out.println("Time estimated: 35 minutes");
    } else if (val <= 7000) {
      System.out.println("Time estimated: 45 minutes");
    } else if (val > 7000) {
      System.out.println("Overloaded");
    } else {
      System.out.println("Invalid input");
    }
    sc.close();
  }
}
