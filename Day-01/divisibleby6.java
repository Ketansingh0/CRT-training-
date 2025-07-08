import java.util.Scanner;
public class divisibleby6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check if it is divisible by 6:");
    int num = sc.nextInt();
    
    // A number is divisible by 6 if it is divisible by both 2 and 3
    // boolean isDivisibleBy2 = (num % 2 == 0);
    // boolean isDivisibleBy3 = (num % 3 == 0);
    
    // if (isDivisibleBy2 && isDivisibleBy3) {
    //   System.out.println(num + " is divisible by 6.");
    // } else {
    //   System.out.println(num + " is not divisible by 6.");
    // }
    
    if(num % 6 == 0){
      System.out.println("Divisible by 6");
    }else{
      System.out.println("Not divisible by 6");
    }
    sc.close();
  }
}
