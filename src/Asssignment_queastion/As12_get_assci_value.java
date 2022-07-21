package Asssignment_queastion;

import java.util.Scanner;

public class As12_get_assci_value {

	public static void main(String[] args) {

		char ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter character : ");
		 ch = sc.next().charAt(0);
		
		int a = ch;
		System.out.println("Assci value is : "+a);
		System.out.println();
		
		
	}

}
