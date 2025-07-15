import java.util.*;

public class UniqueCharacters {
  public static String findUniqueChars(String s1, String s2) {
    Set<Character> set1 = new HashSet<>();
    Set<Character> set2 = new HashSet<>();

    for (char ch : s1.toCharArray()) {
      set1.add(ch);
    }

    for (char ch : s2.toCharArray()) {
      set2.add(ch);
    }

    Set<Character> result = new TreeSet<>();

    for (char ch : set1) {
      if (!set2.contains(ch)) {
        result.add(ch);
      }
    }

    for (char ch : set2) {
      if (!set1.contains(ch)) {
        result.add(ch);
      }
    }

    StringBuilder sb = new StringBuilder();
    for (char ch : result) {
      sb.append(ch);
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();

    String result = findUniqueChars(s1, s2);
    System.out.println(result);
    sc.close();
  }
}
