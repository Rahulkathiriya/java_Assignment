package Exception;

import java.util.Scanner;

class CheckAge{
	
	public void CheckAge(int age) throws AgeInvalidExeption
	{
		if(age < 18)
		{
			throw new AgeInvalidExeption();
		}
		else
		{
			System.out.println("You are eligible for driving and some other activity...");
		}
	}
}

public class S06_ageInvalid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Age : ");
		int age = sc.nextInt();
		
		
		CheckAge ac = new CheckAge();
		try {
			ac.CheckAge(age);
		} catch (AgeInvalidExeption e) {
			e.printStackTrace();
		}
	}

}
