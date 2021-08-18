//Desc -> Computes the prime factorization of N using brute force.

package coreBasicProg;
import java.util.Scanner;
public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find prime factors :");
		int n=sc.nextInt();
		for(int i=2;i*i<=n;i++) {
			while(n%i==0) {
				System.out.print(i+" ");
				n/=i;
			}
		}
		// This condition is to handle the case when n is a prime number
		if (n >= 2)
			System.out.print(n);
	}

}
