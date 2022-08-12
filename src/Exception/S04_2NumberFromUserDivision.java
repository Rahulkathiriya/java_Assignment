package Exception;

import java.util.Scanner;

public class S04_2NumberFromUserDivision {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter First Number : ");
			int first = sc.nextInt();
			
			System.out.print("Enter Second Number : ");
			int second = sc.nextInt();
			
			int third = first/second;
			System.out.print(third);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
