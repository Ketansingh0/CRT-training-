import java.util.*;

public class RemoveDuplicate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int[] result = RemoveDuplicateNum(a);
    System.out.print("[");
    for (int num : result) {
      System.out.print(num + ",");
    }
    System.out.println("]");
  }

  public static int[] RemoveDuplicateNum(int[] arr) {
    Set<Integer> s1 = new HashSet<>();
    for (int num : arr) {
      s1.add(num);
    }
    int[] result = new int[s1.size()];
    int i = 0;
    for (int num : s1) {
      result[i++] = num;
    }

    return result;
  }
}
