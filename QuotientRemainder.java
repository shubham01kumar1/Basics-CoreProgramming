package coreBasicProg;
import java.util.Scanner;

//Java Program to Compute Quotient and Remainder
public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" Please enter Number: ");
		int dividend = sc.nextInt();
		System.out.println(" Please enter Number: ");
		int divisor = sc.nextInt();
		try {
			int quotient = dividend / divisor;
			System.out.println("Quotient = " + quotient);
		}
		catch (java.lang.ArithmeticException e1) {
			System.out.println(e1.getMessage());
			System.out.println("Invalid Input, divisor cannot be zero");
		}
		finally{
			int remainder = dividend % divisor;
			System.out.println("Remainder = " + remainder);
		}
	}
}