package Module2_string;

import java.util.Scanner;

public class S05_check_last_letters {

	public static void main(String[] args) {

		
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Enter First String : ");
		  String first = sc.nextLine();
		  
		  System.out.print("Enter second String : ");
		  String second = sc.nextLine();
		  
		  
		  String endString = "se";
		  
		  boolean firstCheck = first.endsWith(endString);
		  boolean secondCheck = second.endsWith(endString);
		  
		  System.out.println(first+" end with "+endString+" and condition is : "+firstCheck);
		  System.out.println(second+" end with "+endString+" and condition is : "+secondCheck);
		  
		  
		  
	}

}
