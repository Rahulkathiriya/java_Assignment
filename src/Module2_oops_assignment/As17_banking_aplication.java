package Module2_oops_assignment;

import java.util.Scanner;

public class As17_banking_aplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Saving sAccount = new Saving("Rahul kathiriya", 987654, 50000.00);

		int choice = 0;
		char chose;
		
	
		
		do {
		System.out.println("1. diposit");
		System.out.println("2. withdrow");
		System.out.println("3. Intrest Amount");
		System.out.println("4. See Account details");
		System.out.print("Enter choice : ");
		choice = sc.nextInt();
		
		switch (choice) {
		case 1: {
			System.out.println("========= DIPOSIT AMOUNT TRANSACTION =========  ");
			System.out.println();
			sAccount.DipositMoney();

			System.out.println();
			System.out.println("===================================================");
			break;

		}

		case 2: {

			System.out.println("========= WITHDROW AMOUNT TRANSACTION =========  ");
			System.out.println();
			sAccount.WithdrowMoney();
			System.out.println("===================================================");
			break;
		}
		
		case 3:
		{
			System.out.println("============ INTREST AMOUNT PROCESS =================");
			System.out.println();
			sAccount.intrestAmount();
			System.out.println("===================================================");
			break;
		}
		
		case 4:
		{
			System.out.println("============ ACCOUNT DETAILS =================");
			System.out.println();
			sAccount.showinformation();
			System.out.println("==================================================");
			break;
		}
		default:
			System.out.println("erorr................");
			break;
		}
		System.out.print("do you want cotinue (y/n) : ");
		chose = sc.next().charAt(0);
	} while (chose == 'y' || chose == 'Y');
		System.out.println("THANK YOU......");
	}

}
