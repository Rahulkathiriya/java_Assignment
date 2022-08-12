package Exception;

import java.util.Scanner;

class AgeInvalidException extends RuntimeException {

}

class NameinvalidException extends RuntimeException {

}

class StudentInformation {
	String name;
	String course;
	int rollNumber;
	int age;

	public StudentInformation() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Name : ");
		name = sc.nextLine();

		System.out.print("Enter course Name : ");
		course = sc.nextLine();

		System.out.print("Enter RollNumber : ");
		rollNumber = sc.nextInt();

		System.out.print("Enter Your Age : ");
		age = sc.nextInt();

	}

	public void display() {
		if (age < 15 || age > 21) {

			throw new AgeInvalidException();
		} else {
			char[] ch = name.toCharArray();
			
			String special = "@#$%&*()'+,-./:;<=>?[]^_`{|}";
			for(int i=0;i<ch.length;i++)
			{ 
				if(Character.isDigit(ch[i]) || special.contains(Character.toString(ch[i])))
				{
					throw new NameinvalidException();
				}
			}
			
			System.out.println("Student name : "+name);
			System.out.println("Student age : "+age);
			System.out.println("Student course : "+course);
			System.out.println("Student rollNumber : "+rollNumber);

		}
	}
}

public class S08_Check_name_and_ageException {

	public static void main(String[] args) {
		
		StudentInformation info = new StudentInformation();
		
		info.display();

	}

}
