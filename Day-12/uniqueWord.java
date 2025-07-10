import java.util.*;

public class uniqueWord {
  public static void main(String[] args) {
    String s = "my name is pryag";

    int count = countUniqueWords(s);

    System.out.println(count);
  }

  public static int countUniqueWords(String s) {
    String[] words = s.split("\\s+");
    Set<String> s1 = new HashSet<>();

    for (String word : words) {
      s1.add(word.toLowerCase());
    }

    return s1.size();
  }
}
