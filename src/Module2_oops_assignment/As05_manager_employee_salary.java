package Module2_oops_assignment;

import java.util.Scanner;

class Information {
	static String name;
	static int age;
	static int phoneNumber;
	static String address;
	static int salary;
}

class Employee extends Information {
	static void setData() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee Name : ");
		name = sc.nextLine();

		System.out.println("Enter Employee Address : ");
		address = sc.nextLine();

		System.out.print("Enter employee Age : ");
		age = sc.nextInt();

		System.out.println("Enter Employee phone nuumber : ");
		phoneNumber = sc.nextInt();

		System.out.println("Enter Employee salary : ");
		salary = sc.nextInt();
	}

	public static void getData() {
		System.out.println("============EMPLOYEE DETAILS==============");

		System.out.println();

		System.out.println("Employee Name : " + name);
		System.out.println("Employee age : " + age);
		System.out.println("Employee Phone Number : " + phoneNumber);
		System.out.println("Employee Address : " + address);
		System.out.println("Employee Salary : " + salary);
	}

}

class Manager extends Information {
	public static void setData() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Manager Name : ");
		name = sc.nextLine();

		System.out.println("Enter Manager Address : ");
		address = sc.nextLine();

		System.out.print("Enter Manager Age : ");
		age = sc.nextInt();

		System.out.println("Enter Manager phone nuumber : ");
		phoneNumber = sc.nextInt();

		System.out.println("Enter Manager salary : ");
		salary = sc.nextInt();
	}

	public static void getdata() {
		System.out.println("============MANAGER DETAILS==============");

		System.out.println();

		System.out.println("Manager Name : " + name);
		System.out.println("Manager age : " + age);
		System.out.println("Manager Phone Number : " + phoneNumber);
		System.out.println("Manager Address : " + address);
		System.out.println("Manager Salary : " + salary);
	}
}

public class As05_manager_employee_salary {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Employee.setData();
		Employee.getData();

		Manager man = new Manager();
		Manager.setData();
		Manager.getdata();

	}

}
