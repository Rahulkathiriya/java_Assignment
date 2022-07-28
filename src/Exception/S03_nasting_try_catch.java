package Exception;

public class S03_nasting_try_catch {

	public static void main(String[] args) {

		try {
			int maths[] = new int[5];
			try {
				maths[4] = 30 / 0;

			} catch (ArithmeticException e) {
				e.printStackTrace();
			}

			System.out.println(
					"=========================================================================================================");
			maths[7] = 10;

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}

}
