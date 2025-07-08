
// question -
/*
Example1-
 Input- s= "I have 3 pen and 4 pencils"
 output- True

Example2-
  Input- s = I have 3 pencils and 4 pen"
  output- False
 */
import java.util.*;

public class StringQuestion1 {
  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // String s = sc.nextLine();
  // System.out.println(isAscending(s));
  // }

  // public static boolean isAscending(String str) {
  // String[] words = str.split("\\s");
  // int prev = -1;

  // for (String word : words) {
  // if (isNumeric(word)) {
  // int num = Integer.parseInt(word);
  // if (num < prev) {
  // return false;
  // }
  // prev = num;
  // }
  // }
  // return true;
  // }

  // public static boolean isNumeric(String str) {
  // try {
  // Integer.parseInt(str);
  // return true;
  // } catch (NumberFormatException e) {
  // return false;
  // }
  // }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    ArrayList<Integer> arr = new ArrayList<>();
    for (int i = 0; i < s.length() - 1; i++) {
      char ch = s.charAt(i);
      if (Character.isDigit(ch)) {
        arr.add((int) ch);
      }
    }
    System.out.println(checkAsc(arr));
    sc.close();
  }

  public static boolean checkAsc(List<Integer> arr) {
    int a = arr.get(0);
    for (int i = 1; i < arr.size(); i++) {
      if (arr.get(i) < a) {
        return false;
      }
      a = arr.get(i);
    }
    return true;
  }
}
