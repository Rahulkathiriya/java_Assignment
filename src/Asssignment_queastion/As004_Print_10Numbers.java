package Asssignment_queastion;

import java.util.Scanner;

public class As004_Print_10Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		int a=1;
		
		while(a<=n) {
			System.out.println(a);
			a++;
		}
	}

}
