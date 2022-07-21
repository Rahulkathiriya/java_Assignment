package Module2_string;

import java.util.Scanner;

public class S01_get_char_given_index {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String firstString = sc.nextLine();
		
		char choice;
		do
		{
		
		System.out.print("Enter index you want : ");
		int index = sc.nextInt();
		
		System.out.println("In this String "+index+" index position letter is : "+firstString.charAt(index));
		
		System.out.print("CHECK OTHER CHARACTER INDEX (Y/N) : ");
		choice = sc.next().charAt(0);
		}while(choice == 'y' || choice == 'Y');
		
		
		
		
	}

}
