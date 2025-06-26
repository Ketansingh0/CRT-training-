import java.util.*;
public class swap2num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to swap:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Using third variable
        // System.out.println("Before swapping: a = " + a + ", b = " + b);
        // int temp = a;
        // a = b;
        // b = temp;

        // System.out.println("After swapping: a = " + a + ", b = " + b);


        // Using Arithmetic operations
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b; // a now becomes the sum of a and b
        b = a - b; // b now becomes the original value of a
        a = a - b; // a now becomes the original value of b 
        System.out.println("After swapping: a = " + a + ", b = " + b);

        // Using Bitwise XOR
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a ^ b; // a now becomes the XOR of a and b
        b = a ^ b; // b now becomes the original value of a
        a = a ^ b; // a now becomes the original value of b
        System.out.println("After swapping: a = " + a + ", b = " +b);
        sc.close();
    }
}