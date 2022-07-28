package Module2_string;

import java.util.Scanner;

public class S06_compaire_spacified_char_sequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first String : ");
		String first = sc.nextLine();
		
		System.out.print("Enter second String : ");
		String second = sc.nextLine();
		
		
		System.out.print("Enter Char sequance : ");
		CharSequence charcs = sc.next().intern(); 
		
		
		System.out.println("Comparing "+first+" and "+charcs+" : "+first.contains(charcs));
		System.out.println("Comparing "+second+" and "+charcs+" : "+second.contains(charcs));
	}

}
