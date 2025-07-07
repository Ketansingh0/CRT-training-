
public class ExceptionHandling {
  public static void main(String[] args) {
    int[] a = new int[5];
    try {
      int res = 5 / 0;
      System.out.println(res);
      System.out.println(a[6]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Your index is out of bound: " + e);
    } catch (ArithmeticException e) {
      System.out.println("Divide by zero: " + e);
    }
  }
}
