package Asssignment_queastion;

import java.util.Scanner;

public class As008_continus_number_pattern {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		int i,j;
		int k=1;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++,k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
