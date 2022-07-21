package Asssignment_queastion;

import java.util.Scanner;

public class As002_alphabet_vowel_or_not {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter alphabet : ");
		char ch = sc.next().charAt(0);
		

		if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') 
		{
			System.out.println(ch+" character is vowel");
		}
		else
		{
			System.out.println(ch+" is Consonant character  ");
		}
		
		
	}

}
