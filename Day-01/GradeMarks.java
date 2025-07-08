import java.util.Scanner;
public class GradeMarks {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks obtained:");
    int marks = sc.nextInt();
    
    // Using if-else statements
    if (marks >= 90) {
      System.out.println("Grade: A+");
    } else if (marks >= 80) {
      System.out.println("Grade: A");
    } else if (marks >= 70) {
      System.out.println("Grade: B+");
    } else if (marks >= 60) {
      System.out.println("Grade: B");
    } else if (marks >= 50) {
      System.out.println("Grade: C+");
    } else {
      System.out.println("Grade: F");
    }
    
    sc.close();
  }
}
