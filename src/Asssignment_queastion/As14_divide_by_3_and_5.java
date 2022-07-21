package Asssignment_queastion;

import java.util.Scanner;

public class As14_divide_by_3_and_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		
		int i;
		
		System.out.println("DIVIDED BY 3");
		for(i=1;i<=n;i++)
		{
			if(i%3==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("DIVIDED BY 5");
		for(i=1;i<=n;i++)
		{
			if(i%5==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("DIVIDED BY 3 & 5 both");
		for(i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print(i+" ");
			}
		}
		
		
	}

}
