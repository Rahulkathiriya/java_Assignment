package Asssignment_queastion;

import java.util.Scanner;

public class As001_find_largest_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number A : ");
		int a = sc.nextInt();
		
		System.out.print("Enter number B : ");
		int b = sc.nextInt();
		
		System.out.print("Enter number c : ");
		int c = sc.nextInt();
		
		
		if(a>b) {
			if(a>c)
			{
				System.out.println(a+" is greater");
			}
			else
			{
				System.out.println(c+" is greater");
			}
		}
		else {
			if(b>c) {
				System.out.println(b+" is Greater");
			}
			else
			{
				System.out.println(c+" is greater");
			}
		}
		
	}

}
