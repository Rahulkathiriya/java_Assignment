package Asssignment_queastion;

import java.util.Scanner;

public class As009_floyds_triangle {

	public static void main(String[] args) {

		
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter numbrer : ");
		int n = sc.nextInt();
		
		
		for(i=1;i<=n;i++)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
	}

}
