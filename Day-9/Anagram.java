import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine().toLowerCase();
    String str2 = sc.nextLine().toLowerCase();
    System.out.println(isAnagram(str1, str2));
    sc.close();
  }

  public static boolean isAnagram(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    if (Arrays.equals(arr1, arr2)) {
      return true;
    } else {
      return false;
    }
  }
}
