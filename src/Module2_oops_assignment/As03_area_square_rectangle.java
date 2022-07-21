package Module2_oops_assignment;

class Area
{

	public static void area(double a)
	{
		int square = (int) (a*a);
		System.out.println("Area of square is : "+square);
	}
	
	public static void area(int length , int breadth)
	{
		System.out.println("Area of rectagnel is : "+(length*breadth));
	}
	
}

public class As03_area_square_rectangle {

	public static void main(String[] args) {

		Area AR = new Area();
		
		Area.area(144);
		Area.area(152, 145);
		
	}

}
