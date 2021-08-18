
//Prints the Nth Harmonic number: 1/1 + 1/2 + ... + 1/N

package coreBasicProg;
import java.util.Scanner;
public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of N for which you want to know Nth term of Harmonic number");
		int n=sc.nextInt();
		float nTerm=0;
		if(n>0) {
			for(int i=1;i<=n;i++) {
				nTerm+=(float)1/i;
			}
			System.out.println("N th harmonic number is :"+nTerm);
		}
		else
			System.out.println("invalid input plz");
	}
}