package coreBasicProg;
import java.util.Scanner;

//Program to Find the Largest Among Three Numbers
public class LargestAmongThreeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers :");
		
		int a=sc.nextInt();
		int largest=a;
		int b=sc.nextInt();
		if(b>largest)
			largest=b;
		int c=sc.nextInt();
		if(c>largest)
			largest=c;
		System.out.println("the largest number among three is: "+largest);
	}
}
