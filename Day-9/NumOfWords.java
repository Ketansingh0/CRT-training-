import java.util.Scanner;

public class NumOfWords {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine();
    System.out.println(numOfWords(sentence));
    sc.close();
  }

  static int numOfWords(String sentence) {
    String[] words = sentence.trim().split("\\s+");
    int n = words.length;
    return n;
  }
}
