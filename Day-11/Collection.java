import java.util.*;

public class Collection {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> lst = new ArrayList<>();
    System.out.println("You want exit press -1");
    while (true) {
      int num = sc.nextInt();
      if (num == -1) {
        break;
      }
      lst.add(num);
    }
    System.out.println(lst);
    sc.close();
  }
}
