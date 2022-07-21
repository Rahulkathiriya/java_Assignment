package Asssignment_queastion;

import java.util.Scanner;

public class As010_pascal_triangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number ; ");
		int n = sc.nextInt();
		
		int i,j,k;
		for(i=0;i<=n;i++)
		{
			for(k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			int number =1;
			for(j=0;j<=i;j++)
			{
				System.out.print(number+" ");
				number = number*(i-j)/(j+1);
			}
			System.out.println();
		}
		
		
	}

}
