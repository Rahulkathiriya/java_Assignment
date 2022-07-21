package Module2_string;

import java.util.Scanner;

public class S02_concate_string_another_string {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String firstString = sc.nextLine();
		
		System.out.print("Enter second String : ");
		String secondString = sc.nextLine();
		
		String newString = firstString.concat(secondString);
		
		System.out.println("After concatination string is : "+newString);

	}

}
