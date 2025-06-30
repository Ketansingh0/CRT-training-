import java.util.Scanner;

public class maxSubarray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int maxSum = arr[0];
    int currentSum = arr[0];

    for (int i = 1; i < n; i++) {
      currentSum = max(arr[i], currentSum + arr[i]);
      maxSum = max(maxSum, currentSum);
    }

    System.out.println("Maximum subarray sum is: " + maxSum);
    sc.close();
  }

  static int max(int a, int b) {
    return (a > b ? a : b);
  }
}
