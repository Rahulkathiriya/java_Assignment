package Module2_oops_assignment;

import java.util.Scanner;

class ShapeClass {

	ShapeClass() {
		System.out.println("this is the shape class............");
	}
}

class RectangleArea extends ShapeClass {

	RectangleArea() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length : ");
		int length = sc.nextInt();

		System.out.print("Enter breadth : ");
		int breadth = sc.nextInt();

		System.out.println("Area of rectangle is : " + (length * breadth));
	}
}

class SquareValue extends RectangleArea {
	SquareValue() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Square variable : ");
		int square = sc.nextInt();

		System.out.print("Square value is : " + (square * square));
	}
}

class CircleArea extends ShapeClass {
	CircleArea() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Radius : ");
		int radius = sc.nextInt();

		float PI = 3.14f;

		System.out.println("Area of circle is : " + (PI * radius * radius));

	}
}

public class As15_shape_class_circle_area {

	public static void main(String[] args) {

		SquareValue sq = new SquareValue();
		CircleArea cr = new CircleArea();
		

	}

}
