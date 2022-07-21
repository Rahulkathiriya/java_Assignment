package Asssignment_queastion;

import java.util.Scanner;

public class As16_number_between_0_to_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A number : ");
		double a = sc.nextDouble();
		
		System.out.print("Enter B number : ");
		double b = sc.nextDouble();
		
		
		if(a<=1 && b>=0)
		{
			System.out.println();
			System.out.print("Condition are true....");
		}
		else
		{
			System.out.println();
			System.out.println("Condition are false");
		}
		
	}

}
