import java.util.*;

public class mergeTwoSorted {

  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2, 8, 12, 20, 22));
    ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 7, 8));

    SortedMerge(list1, list2);
    System.out.println(list1);
  }

  public static void SortedMerge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
    int i = 0;
    int j = 0;

    while (j < list2.size()) {
      while (i < list1.size() && list1.get(i) <= list2.get(j)) {
        i++;
      }

      list1.add(i, list2.get(j));
      i++;
      j++;
    }
  }
}
