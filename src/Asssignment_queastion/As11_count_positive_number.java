package Asssignment_queastion;

import java.util.Scanner;

public class As11_count_positive_number {

	public static void main(String[] args) {

		int count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		
		while(n>0)
		{
			count++;
			n = n/10;
	}
		System.out.println("Total number is : "+count);
		
		
	}

}
