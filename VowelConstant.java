package coreBasicProg;
import java.util.Scanner;

//Program to Check Whether an Alphabet is Vowel or Consonant
public class VowelConstant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Alphabet to check :");
		char ch = sc.next().charAt(0);
		  if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
		     System.out.println("Given character is an vowel");
		  }
		  else{
		     System.out.println("Given character is a consonant");
		  }
	}
}