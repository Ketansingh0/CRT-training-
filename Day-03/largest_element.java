import java.util.Scanner;

public class largest_element {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int largest_element = arr[0];
    for (int i = 1; i < n; i++) {
      if (arr[i] > largest_element) {
        largest_element = arr[i];
      }
    }
    System.out.println("Largest element is: " + largest_element);
    sc.close();
  }
}
