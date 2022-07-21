package Module2_oops_assignment;

import java.util.Scanner;

abstract class Marks {
	public abstract void getParcentage();
}

class FirstStudent extends Marks {
	@Override
	public void getParcentage() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student name : ");
		String name = sc.nextLine();

		System.out.print("Enter Maths Marks : ");
		int maths = sc.nextInt();

		System.out.print("Enter English Marks : ");
		int english = sc.nextInt();

		System.out.print("Enter Physics marks : ");
		int physics = sc.nextInt();

		System.out.print("Enter psychology Marks");
		int psychology = sc.nextInt();

		int total = maths + english + physics + psychology;

		double parcentage = (double) total / 4;

		System.out.println();
		System.out.println("========FIRST SRUDENT MARKSHEETS=========");
		System.out.println();

		System.out.println("Student name : " + name);
		System.out.println("Maths maeks : " + maths);
		System.out.println("English marks : " + english);
		System.out.println("physics marks : " + physics);
		System.out.println("psychology marks : " + psychology);
		System.out.println("Total Marks : " + total);
		System.out.println("parcentage is : " + parcentage);

		System.out.println("====================================================");
	}

}

class SecondStudent extends Marks {
	@Override
	public void getParcentage() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student name : ");
		String name = sc.nextLine();

		System.out.print("Enter Maths Marks : ");
		int maths = sc.nextInt();

		System.out.print("Enter English Marks : ");
		int english = sc.nextInt();

		System.out.print("Enter Physics marks : ");
		int physics = sc.nextInt();

		System.out.print("Enter psychology Marks");
		int psychology = sc.nextInt();

		int total = maths + english + physics + psychology;

		double parcentage = (double) total / 4;

		System.out.println();
		System.out.println("========FIRST SRUDENT MARKSHEETS=========");
		System.out.println();

		System.out.println("Student name : " + name);
		System.out.println("Maths maeks : " + maths);
		System.out.println("English marks : " + english);
		System.out.println("physics marks : " + physics);
		System.out.println("psychology marks : " + psychology);
		System.out.println("Total Marks : " + total);
		System.out.println("parcentage is : " + parcentage);

		System.out.println("====================================================");
	}

}

class ThirdStudent extends Marks {
	@Override
	public void getParcentage() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student name : ");
		String name = sc.nextLine();

		System.out.print("Enter Maths Marks : ");
		int maths = sc.nextInt();

		System.out.print("Enter English Marks : ");
		int english = sc.nextInt();

		System.out.print("Enter Physics marks : ");
		int physics = sc.nextInt();

		System.out.print("Enter psychology Marks");
		int psychology = sc.nextInt();

		int total = maths + english + physics + psychology;

		double parcentage = (double) total / 4;

		System.out.println();
		System.out.println("=========SRUDENT MARKSHEETS=========");
		System.out.println();

		System.out.println("Student name : " + name);
		System.out.println("Maths maeks : " + maths);
		System.out.println("English marks : " + english);
		System.out.println("physics marks : " + physics);
		System.out.println("psychology marks : " + psychology);
		System.out.println("Total Marks : " + total);
		System.out.println("parcentage is : " + parcentage);
	}

}

public class As11_paracentage_calculate_student {

	public static void main(String[] args) {

		FirstStudent fi = new FirstStudent();
		fi.getParcentage();

		SecondStudent st = new SecondStudent();
		st.getParcentage();

		ThirdStudent th = new ThirdStudent();
		th.getParcentage();

	}

}
