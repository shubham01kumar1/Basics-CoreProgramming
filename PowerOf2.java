package coreBasicProg;
import java.util.Scanner;
public class PowerOf2 {

	public static void main(String[] args) {
		System.out.println("Enter the vaule of n to which you want table of power of 2:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=0 && n<31) {
			for(int i=0;i<=n;i++) {
				int value= (int) Math.pow(2, i);
				System.out.println(value);
			}
		}
		else
			System.out.println("Invalid input, plz enter the value between 0-31");
	}

}
