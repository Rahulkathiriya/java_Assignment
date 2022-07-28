package Module2_string;

import java.util.Scanner;

public class S04_check_first_letter {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First String : ");
		String first = sc.nextLine();
		
		System.out.print("Enter Second String : ");
		String second = sc.nextLine();
		
		first = first.toLowerCase();
		second = second.toLowerCase();
		
		String startLatter = "red";
		
		boolean firstCheck = first.startsWith(startLatter);
		boolean secondCheck = second.startsWith(startLatter);
		
		System.out.println(first+" Start with "+startLatter+" and condition is : "+firstCheck);
		System.out.println(second+" Start with "+startLatter+" and condition is : "+secondCheck);
		
	}

}
