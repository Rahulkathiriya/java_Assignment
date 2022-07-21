package Module2_oops_assignment;

import java.util.Scanner;

class Factorial {

	public static int fact(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}

		else {
			return n * fact(n - 1);
		}

	}
}

public class As12_factorial_number_method_factorial {

	public static void main(String[] args) {

		Factorial f = new Factorial();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter factorial number : ");
		int number = sc.nextInt();

		int fact = f.fact(number);

		System.out.println("Facotorial of (" + number + ") is : " + fact);

	}

}
