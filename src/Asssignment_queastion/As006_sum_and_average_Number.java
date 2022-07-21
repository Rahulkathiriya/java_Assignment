package Asssignment_queastion;

import java.util.Scanner;

public class As006_sum_and_average_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		
		int i;
		int sum = 0;
		double average;
		System.out.println("Enter Any "+n+" Number : ");

		for(i=1;i<=n;i++)
		{
			Scanner in = new Scanner(System.in);
			int number = in.nextInt();
			
			
			sum = sum + number;
		}
		
		average = (float)sum/n;
		
		System.out.println("Sum of all number is : "+sum);
		System.out.println("Average value is : "+average);
	}

}
