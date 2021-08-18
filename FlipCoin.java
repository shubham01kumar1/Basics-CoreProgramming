package coreBasicProg;
import java.util.Scanner;
public class FlipCoin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int HEAD=1;
		int countHead=0, countTail=0;
		System.out.println("Enter the number of time you want to flip a coin ");
		int input = sc.nextInt();
		if (input<1) {
			System.out.println("Invalid Input");
			return;
		}
			
		for (int i=0;i<input;i++) {
		  int flip = (int) Math.floor(Math.random()*10%2);
		      if (flip==HEAD) {
		    	  countHead++;
		      }
		      else {
		    	  countTail++;
		      }
		}
		int headPercentage = (countHead*100/input);
		int tailPercentage = (countTail*100/input);
		System.out.println("Number of times head come =" +countHead);
		System.out.println("Number of times tail come =" +countTail);
		System.out.println("Percentage of head = " +headPercentage);
		System.out.println("Percentage of tail = " +tailPercentage);

	}

}
