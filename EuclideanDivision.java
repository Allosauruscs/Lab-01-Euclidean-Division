import java.util.Scanner;

/* This program prompts the user for the dividend and divisor and displays the quotient and remainder using Euclidean Division
 @author Allosauruscs */
public class EuclideanDivision {
    public static void main(String[] args) {
        int dividend, divisor, quotient, remainder;
        // Scanner object to receive keyboard input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Euclidean Division");
        // Prompt the user to enter an integer
        System.out.print("Enter the dividend: ");
        dividend = input.nextInt();
        System.out.print("Enter the divisor: ");
        divisor = input.nextInt();
        quotient = dividend / divisor;
        remainder = dividend % divisor;
        System.out.println(dividend + " = " + divisor + " * " + quotient + " + " + remainder);
    }
}