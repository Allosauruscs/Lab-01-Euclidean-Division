import java.util.Scanner;

/* This program prompts the user for the dividend and divisor and displays the quotient and remainder using Euclidean Division
 @author Allosauruscs */
public class EuclideanDivision {
    public static void main(String[] args) {
        // Scanner object to receive keyboard input
        int dividend, divisor, quotient, remainder;
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter an integer
        System.out.println("Euclidean Division");

        System.out.print("Enter the dividend: ");
        dividend = input.nextInt();
        System.out.print("Enter the divisor: ");
        divisor = input.nextInt();
        quotient = dividend / divisor;
        remainder = dividend % divisor;
        System.out.println(quotient);
        System.out.println(remainder);
        System.out.println(dividend + "=" + divisor + "*" + quotient + "+" + remainder);
    }
}