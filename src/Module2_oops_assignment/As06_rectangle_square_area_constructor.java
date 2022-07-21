package Module2_oops_assignment;

class Rectangle {
	int length;
	int breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void getdata() {
		System.out.println((length * breadth));
	}

	
}

class Square extends Rectangle {

	public Square(int s) {
		super(s, s);
	}

}

	

public class As06_rectangle_square_area_constructor {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle(4, 5);
		Square s = new Square(5);

		rect.getdata();
		s.getdata();

	}

}
