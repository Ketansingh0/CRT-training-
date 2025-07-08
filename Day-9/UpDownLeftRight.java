import java.util.Scanner;

public class UpDownLeftRight {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter word using UDLR");
    String str = sc.nextLine();
    Coordinate(str);
    sc.close();
  }

  public static void Coordinate(String str) {
    int x = 0;
    int y = 0;
    String a = str.toUpperCase();
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) == 'U') {
        y++;
      } else if (a.charAt(i) == 'D') {
        y--;
      } else if (a.charAt(i) == 'R') {
        x++;
      } else if (a.charAt(i) == 'L') {
        x--;
      }
    }
    double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    System.out.println("(" + x + "," + y + ")");
    System.out.println(distance);
  }
}
