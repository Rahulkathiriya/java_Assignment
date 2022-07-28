package Exception;

public class S02demonstrate_multiple_catch_blocks {

	public static void main(String[] args) {
 
		System.out.println("Starting point..................");
		
		try {
			
			int maths[] = new int[5];
			
			maths[5] = 30/0;
			
			
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			a.printStackTrace();
		}
		
		System.out.println("ending point.............");
		
	}

}
