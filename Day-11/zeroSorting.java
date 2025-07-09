import java.util.*;

public class zeroSorting {
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
    System.out.println("After removing zero and adding it in the last" + SortZero(lst));
  }

  private static ArrayList<Integer> SortZero(ArrayList<Integer> lst) {
    int s = 0;
    for (int i = 0; i < lst.size() - 1; i++) {
      if (lst.get(i) == 0) {
        lst.remove(i);
        s++;
      }
    }
    for (int i = 0; i < s; i++) {
      lst.add(0);
    }
    return lst;
  }
}
