import java.util.*;

public class Intersection {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) {
      arr1[i] = sc.nextInt();
    }

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) {
      arr2[i] = sc.nextInt();
    }
    System.out.println(findIntersection(arr1, arr2));
    int[] result = findIntersection(arr1, arr2);
    System.out.println(Arrays.toString(result));
    sc.close();
  }

  public static int[] findIntersection(int[] arr1, int[] arr2) {
    Set<Integer> set1 = new LinkedHashSet<>();
    Set<Integer> set2 = new LinkedHashSet<>();

    for (int num : arr1) {
      set1.add(num);
    }

    for (int num : arr2) {
      if (set1.contains(num)) {
        set2.add(num);
      }
    }
    int[] num = new int[set2.size()];
    int i = 0;
    for (int val : set2) {
      num[i++] = val;
    }
    return num;
  }
}
