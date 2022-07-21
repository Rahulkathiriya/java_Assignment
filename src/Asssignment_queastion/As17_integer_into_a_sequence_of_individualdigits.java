package Asssignment_queastion;

import java.util.Scanner;

public class As17_integer_into_a_sequence_of_individualdigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any digits : ");
		int n = sc.nextInt();
		int temp = n,digit;
		int count=0;
		
		while(temp>0) {
			digit= temp%10;
			System.out.println(digit);
			temp = temp/10;
			count--;
		}
		
	}

}
