public class Wrapper {
  public static void main(String[] args) {
    Integer a = 12;
    Integer b = Integer.valueOf(13); // Boxing

    Integer num1 = 12;
    Integer num2 = 5;
    Integer result = num1 - num2;
    System.out.println(Integer.max(num1, num2));
    System.out.println(result);
    System.out.println(a - b);
  }
}
