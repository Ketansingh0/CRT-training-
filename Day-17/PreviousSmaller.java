import java.util.Stack;

public class PreviousSmaller {
  public static void main(String[] args) {
    int[] arr = { 2, 4, 1, 8, 3, 5, 7 };
    int[] result = previousSmallerArr(arr);
    for (int num : result) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public static int[] previousSmaller(int[] arr) {
    int n = arr.length;
    int[] res = new int[n];

    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < n; i++) {
      while (!stack.isEmpty() && stack.peek() >= arr[i]) {
        stack.pop();
      }
      if (stack.isEmpty()) {
        res[i] = -1;
      } else {
        res[i] = stack.peek();
      }
      stack.push(arr[i]);
    }
    return res;
  }

  public static int[] previousSmallerArr(int[] arr) {
    int n = arr.length;
    int[] res = new int[n];
    for (int i = 0; i < n; i++) {
      int smaller = -1;
      for (int j = i - 1; j >= 0; j--) {
        if (arr[j] < arr[i]) {
          smaller = arr[j];
          break;
        }
      }
      res[i] = smaller;
    }
    return res;
  }
}
