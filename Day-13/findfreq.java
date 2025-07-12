import java.util.*;

public class findfreq {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 6, 8, 3, 2, 1, 4, 5, 3, 2 };
    Map<Integer, Integer> freq = new HashMap<>();

    for (int num : a) {
      freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    for (int key : freq.keySet()) {
      System.out.println(key + " : " + freq.get(key));
    }
  }
}
