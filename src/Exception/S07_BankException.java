package Exception;

import java.util.Scanner;

class BankingProgram {
	int balance;

	public void Diposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter diposit Amount : ");
		int diposit = sc.nextInt();
		balance = diposit + balance;
		System.out.println("Diposited Amount is : " + diposit);

		System.out.println("After Diposit Bank balance is : " + balance);

	}

	public void withdrow() throws AmountInvalidException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Withdrow Amount : ");
		int withdrow = sc.nextInt();
		if (withdrow > balance) {
			System.out.println();
			System.out.println("You need More " + (withdrow - balance) + " Rupees for Withdrow");
			System.out.println("Your bank balance is : "+balance);
			throw new AmountInvalidException();
		} else {
			balance = balance - withdrow;
			System.out.println("Withdrow Amount is : " + withdrow);

			System.out.println("Clear balance is : " + balance);
		}
	}

}

public class S07_BankException {

	public static void main(String[] args) {

		BankingProgram bank = new BankingProgram();

		bank.Diposit();
		try {
			bank.withdrow();
		} catch (AmountInvalidException e) {

			e.printStackTrace();
		}
	}

}
