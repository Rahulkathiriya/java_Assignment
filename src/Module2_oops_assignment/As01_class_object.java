package Module2_oops_assignment;

class printNumber
{
	public static void getData(int a, int b)
	{
		System.out.println("Addition of "+ a +" + "+ b +" is : "+(a+b));
		
	}
	
	public static void getData(float a, float b)
	{
		System.out.println("Multiplication  of "+ a +" * "+ b +" is : "+(a*b));
	}
	
	public static void getData(double a, float b)
	{
		System.out.println("Division  of "+ a +" / "+ b +" is : "+(a/b));
	}
	
	
}

public class As01_class_object {

	public static void main(String[] args) {

		printNumber print = new printNumber();
		
		printNumber.getData(22, 44);
		printNumber.getData(14.5f,22.5f);
		printNumber.getData(20.2,11.2f);
		
		

	}

}
