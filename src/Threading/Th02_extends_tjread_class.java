package Threading;

import java.util.Scanner;

class firstExample extends Thread {

	public void run() {

		String name;
		int age;
		String email;

		Scanner sc = new Scanner(System.in);

		System.out.println("===============================");

		System.out.println("Enter name : ");
		name = sc.nextLine();

		sc.nextLine();

		System.out.println("Enter Email : ");
		email = sc.nextLine();

		System.out.println("Enter Age : ");
		age = sc.nextInt();

		System.out.println("=======================================");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Email : " + email);

	}
}

public class Th02_extends_tjread_class {

	public static void main(String[] args) {
		
		
		firstExample first = new firstExample();
		
		first.start();

	}

}
