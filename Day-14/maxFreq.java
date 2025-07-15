import java.util.*;

public class maxFreq {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    countMaxFreq(str);
    sc.close();
  }

  public static void countMaxFreq(String str) {
    Map<String, Integer> map = new HashMap<>();
    String[] words = str.split("\\s+");
    for (String word : words) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }

    String maxWord = "";
    int maxfreqCount = 0;
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() > maxfreqCount) {
        maxWord = entry.getKey();
        maxfreqCount = entry.getValue();
      }
    }
    System.out.println(maxWord);
    System.out.println(maxfreqCount);
  }
}
