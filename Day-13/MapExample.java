import java.util.*;

public class MapExample {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("A", 70);
    map.put("B", 80);
    map.put("F", 75);
    map.put("D", 60);
    map.put("E", 89);
    System.out.println(map);

    for (String key : map.keySet()) {
      System.out.println(key + " : " + map.get(key));
    }
  }
}
