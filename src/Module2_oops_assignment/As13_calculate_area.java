package Module2_oops_assignment;

abstract class Shape {

	public abstract void RectangleArea(int length, int breadth);

	public abstract void CircleArea(int radius);

	public abstract void SquareArea(double s);

}

class AllArea extends Shape {
	@Override
	public void RectangleArea(int length, int breadth) {

		System.out.println("Area of Rectangle is : " + (length * breadth));

	}

	@Override
	public void CircleArea(int radius) {

		float PI = 3.14f;
		System.out.println("Area of circle is : " + (PI * radius * radius));
	}

	@Override
	public void SquareArea(double s) {

		System.out.println("Square value is : " + (s * s));
	}
}

public class As13_calculate_area {

	public static void main(String[] args) {

		AllArea ar = new AllArea();
		ar.RectangleArea(15, 16);
		ar.CircleArea(12);
		ar.SquareArea(122.5);
	}

}
