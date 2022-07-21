package Asssignment_queastion;

import java.util.Scanner;

public class As15_sum_of_2_integer {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A number ; ");
		int a = sc.nextInt();
		
		System.out.print("Enter B number ; ");
		int b = sc.nextInt();
		
		System.out.print("Enter C number ; ");
		int c = sc.nextInt();
		
		if((a+b)==c)
		{
			System.out.println();
			System.out.print("Condition is true....");
		}
		else
		{
			System.out.println();
			System.out.println("Condition is false");
		}
	}

}
