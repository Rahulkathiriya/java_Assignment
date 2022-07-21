package Asssignment_queastion;

import java.util.Scanner;

public class As003_leep_year_or_not {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter year : ");
		int year = sc.nextInt();

			
		if(year%4==0 || year%400==0 && year%100!=0)
		{
			System.out.println(year+" is leep year");
		}
		else
		{
			System.out.println(year+" is not leep year");
		}
		
		
	}

}
