package Module2_oops_assignment;

class Integer
{
	public static void display(int a, String name)
	{
		System.out.println("Integer value is : "+a);
		System.out.println("String value is : "+name);
	}
	
	public static void display(String name, int a)
	{
		System.out.println("String value is : "+name);
		System.out.println("Integer value is : "+a);
	}
}


class Stringst extends Integer
{
	Integer In = new Integer();
	
	public static void display(float a , String name)
	{
		System.out.println("Floating Square value is : "+(a*a));
		System.out.println("String value is : "+name);
	}
	
	public static void display(String name , float a)
	{
		System.out.println("Floating Square value is : "+(a*a) );
		System.out.println("String value is : "+name);
		
		
	}
}

public class As02_Print_integer_Character {

	public static void main(String[] args) {
		
		Stringst ST = new Stringst(); 

		Stringst.display(401, "Rahul");
		Stringst.display("Kathiriya", 104);
		System.out.println("====================================================");
		Stringst.display(111, "RAVI");
		Stringst.display("KATHIRIYA", 111);

	}

}
