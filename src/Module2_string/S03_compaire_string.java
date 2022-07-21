package Module2_string;

import java.util.Scanner;

public class S03_compaire_string {

	public static void main(String[] args) {

		    Scanner sc = new Scanner(System.in);
		    
		    System.out.print("Enter First String : ");
		    String first = sc.nextLine();
		
		 
		    System.out.print("Enter second String : ");
		    String second = sc.nextLine();	
		    
		    System.out.print("Enter char value : ");
		    char charsequence = sc.next().charAt(0);
		
		    System.out.println("Comparing "+first+" and "+second+" and condition are :  "+first.equalsIgnoreCase(second));
		    
	}

}
