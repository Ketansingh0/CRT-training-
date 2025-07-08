import java.util.Scanner;
public class EvenOrOdd {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check if it is even or odd:");
    int num = sc.nextInt();
    
    // Arithmetic operator
    // A number is even if it is divisible by 2
    // boolean isEven = (num % 2 == 0);
    
    // if (isEven) {
    //   System.out.println(num + " is even.");
    // } else {
    //   System.out.println(num + " is odd.");
    // }
    
    // if(num % 2 == 0){
    //   System.out.println("Even");
    // }else{
    //   System.out.println("Odd");
    // }
    
    // Bitwise operator
    if((num & 1) == 0){
      System.out.println("Even (using bitwise operator)");
    }else{
      System.out.println("Odd (using bitwise operator)");
    }
    sc.close();
  }
}
