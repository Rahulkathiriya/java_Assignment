package Module2_oops_assignment;

import java.util.Scanner;

class Subject {
	static String name;
	static int maths;
	static int english;
	static int physics;
	static int psychology;
	static int total;
	static double parcentage;
}

class MarkSheets extends Subject {

	public static void setdata() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student name : ");
		String name = sc.nextLine();

		System.out.print("Enter Maths Marks : ");
		int maths = sc.nextInt();

		System.out.print("Enter English Marks : ");
		int english = sc.nextInt();

		System.out.print("Enter Physics marks : ");
		int physics = sc.nextInt();

		System.out.print("Enter psychology Marks : ");
		int psychology = sc.nextInt();

		int total = maths + english + physics + psychology;

		double parcentage = (double) total / 4;



		System.out.println();
		System.out.println("=========SRUDENT MARKSHEETS=========");
		System.out.println();

		System.out.println("Student name : " +name);
		System.out.println("Maths maeks : " + maths);
		System.out.println("English marks : " + english);
		System.out.println("physics marks : " + physics);
		System.out.println("psychology marks : " + psychology);
		System.out.println("Total Marks : " + total);
		System.out.println("parcentage is : " + parcentage);

		if (parcentage >= 90) {
			System.out.println("You are pass with AA grade..........");
		} else if (parcentage < 90 && parcentage >= 80) {
			System.out.println("You are pass with AB grade.........");
		} else if (parcentage < 80 && parcentage >= 70) {
			System.out.println("You are pass with BB grade..........");
		} else if (parcentage < 70 && parcentage >= 60) {
			System.out.println("You ae pass with BC grade...........");
		} else if (parcentage < 60 && parcentage >= 50) {
			System.out.println("You are pass with CD grade..........");
		} else if (parcentage < 50 && parcentage >= 41) {
			System.out.println("You are pass with DD grade............");
		} else {
			System.out.println("You are fale...........................");
		}
	}

}

public class As14_if_else__parcentage {

	public static void main(String[] args) {

		MarkSheets ms = new MarkSheets();

		MarkSheets.setdata();

	}

}
