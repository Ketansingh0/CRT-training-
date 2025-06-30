import java.util.Scanner;

public class SecondLargest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int secondLargest = function(arr);
    System.out.println("Second largest element is: " + secondLargest);
    sc.close();
  }

  public static int function(int[] arr) {
    int largest = -1;
    int secondLargest = -1;
    for (int num : arr) {
      if (num > largest) {
        secondLargest = largest;
        largest = num;
      } else if (num > secondLargest && num != largest) {
        secondLargest = num;
      }
    }
    return secondLargest;
  }
}
