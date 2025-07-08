
public class StringExample {
  public static void main(String[] args) {
    String name1 = "Ram";
    String name2 = "Ram";
    System.out.println(name1 == name2);

    String name3 = new String("Ram");
    System.out.println(name1 == name3);
  }
}
