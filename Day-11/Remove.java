import java.util.*;

public class Remove {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> lst = new ArrayList<>();
    System.out.println("Enter numbers (press -1 to exit):");

    while (true) {
      int num = sc.nextInt();
      if (num == -1)
        break;
      lst.add(num);
    }

    System.out.println("Original List: " + lst);
    System.out.println("After removing even numbers: " + removeEven(lst));
    sc.close();
  }

  public static ArrayList<Integer> removeEven(ArrayList<Integer> list) {
    for (int i = list.size() - 1; i >= 0; i--) {
      if (i % 2 == 0) {
        list.remove(i);
      }
    }
    return list;
  }
}
