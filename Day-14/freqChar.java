import java.util.*;

public class freqChar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    countChar(str);
    sc.close();
  }

  public static void countChar(String str) {
    Map<Character, Integer> freq = new HashMap<>();
    str = str.toLowerCase();
    for (char ch : str.toCharArray()) {
      if (ch != ' ') {
        freq.put(ch, freq.getOrDefault(ch, 0) + 1);
      }
    }
    for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
}
