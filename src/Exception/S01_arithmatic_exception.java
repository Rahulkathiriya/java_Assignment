package Exception;


public class S01_arithmatic_exception {

	public static void main(String[] args) {


		System.out.println("Program started");
		try {

			int number = 10;
			int secNumber = 10/0;

		} catch (ArithmeticException e) {
			e.printStackTrace();

		}

		System.out.println("Program Ending....");

	}

}
