import java.util.*;

public class caesarCipher {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int key = sc.nextInt();
    sc.nextLine();
    String input = sc.nextLine();

    String res = "";
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);

      if (Character.isUpperCase(ch)) {
        res += (char) ((ch - 'A' + key) % 26 + 'A');
      } else if (Character.isLowerCase(ch)) {
        res += (char) ((ch - 'a' + key) % 26 + 'a');
      } else if (Character.isDigit(ch)) {
        res += (char) ((ch - '0' + key) % 10 + '0');
      } else {
        res += ch;
      }
    }

    System.out.println(res);
  }
}
