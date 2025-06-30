import java.util.Scanner;

public class MatrixOperation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input matrix dimensions
    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();

    System.out.print("Enter number of columns: ");
    int cols = sc.nextInt();

    // Declare matrices
    int[][] A = new int[rows][cols];
    int[][] B = new int[rows][cols];

    // Input for Matrix A
    System.out.println("Enter elements of Matrix A:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        A[i][j] = sc.nextInt();
      }
    }

    // Input for Matrix B
    System.out.println("Enter elements of Matrix B:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        B[i][j] = sc.nextInt();
      }
    }

    // Matrix Addition
    int[][] sum = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        sum[i][j] = A[i][j] + B[i][j];
      }
    }

    // Matrix Multiplication
    int[][] product = new int[rows][cols];
    if (cols == rows) { // Multiplication valid only if matrices are square
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
          for (int k = 0; k < cols; k++) {
            product[i][j] += A[i][k] * B[k][j];
          }
        }
      }
    }

    // Display Results
    System.out.println("\nMatrix A:");
    printMatrix(A);
    System.out.println("Matrix B:");
    printMatrix(B);

    System.out.println("Matrix Addition (A + B):");
    printMatrix(sum);

    if (cols == rows) {
      System.out.println("Matrix Multiplication (A x B):");
      printMatrix(product);
    } else {
      System.out.println("Matrix multiplication not possible (columns of A must equal rows of B)");
    }
    sc.close();
  }

  // Print matrix function
  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int val : row) {
        System.out.print(val + "\t");
      }
      System.out.println();
    }
  }
}
