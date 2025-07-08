import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // String ans = "";
    // for (int i = str.length() - 1; i >= 0; i--) {
    // ans += str.charAt(i);
    // }
    // if (str.equals(ans)) {
    // System.out.println("Palindrome");
    // } else {
    // System.out.println("Not a Palindrome");
    // }
    String str1 = str.toLowerCase();

    Boolean isPalindrome = true;
    int left = 0;
    int right = str1.length() - 1;
    while (left < right) {
      if (str1.charAt(left) != str1.charAt(right)) {
        isPalindrome = false;
        break;
      }
      left++;
      right--;
    }
    if (isPalindrome) {
      System.out.println("Yes , Palindrome");
    } else {
      System.out.println("No, not a Palindrome");
    }
    sc.close();
  }
}
