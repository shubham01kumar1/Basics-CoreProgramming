package coreBasicProg;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year you want to check as leap year in format YYYY");
		int year=sc.nextInt();
		if (year >= 0000 && year <= 9999) {
			if ((year % 4 ==0 && year % 100 !=0) || year % 400 ==0)
				System.out.println("It is a leap Year");
			else
				System.out.println("It is not a Leap Year");
		}
		else
			System.out.println("Invalid Input, plz enter in format YYYY");
	}
}