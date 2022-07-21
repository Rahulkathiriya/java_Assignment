package Module2_oops_assignment;

import java.util.Scanner;

class Triangle {
	int a;
	int b;
	int c;

	public double getArea() {
		double p = (float) (a + b + c) / 2;
		return p;
	}

}

public class As07_Triangle_area_3_4_5_side {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		Triangle tri = new Triangle();
		
		System.out.print("Enter A value : ");
		tri.a = sc.nextInt();
		System.out.print("Enter B value : ");
		tri.b = sc.nextInt();
		System.out.print("Enter C value : ");
		tri.c = sc.nextInt();

		System.out.println("Area of triangle is : " + tri.getArea());
	}

}
