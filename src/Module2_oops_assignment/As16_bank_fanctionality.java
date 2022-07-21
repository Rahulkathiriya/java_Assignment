package Module2_oops_assignment;

import java.util.Scanner;

class RBI {

	protected String name;
	protected int accNumber;
	protected double balance;
	protected double intrest;
	protected double intrestRate = 4.90;
	protected int intrestYear = 1;
	protected int lastTransaction;
}

class SavingAccount extends RBI {
	Scanner sc = new Scanner(System.in);

	int pin = sc.nextInt();

	public void OpenAccount(String name, int accNumber , double balance , double intrestRate , int intrestYear) {

		this.name = name;
		this.accNumber = accNumber;
		this.balance = balance;
		this.intrestYear = intrestYear;
		this.intrestRate = intrestRate; 
	
	}



	public void Diposit() {

		 int diposit;
		System.out.print("PLEASE ENTER YOUR PIN : ");
		int pin = sc.nextInt();
		if (pin != 9844) {
			System.out.println("YOU ENTER WRONG PIN NUMBER : ");
		} else {
			System.out.println("Enter Amount you want to diposit : ");
			diposit = sc.nextInt();

			this.balance = diposit + this.balance;

			System.out.println("Clear balance is : " + this.balance);
			System.out.println();

		}
	}

	public void Withdrow() {
      
		int withdrow;
		System.out.print("PLEASE ENTER YOUR PIN : ");
		int pin = sc.nextInt();
		if (pin != 9844) {
			System.out.println("YOU ENTER WRONG PIN NUMBER : ");
		} else {

			System.out.println("SAVING ACCOUNT PER ONE TRANSACTION WITHDROW LIMIUT IS 10,000 RS. : ");
			System.out.println();

			System.out.println("Enter Amount you want to withdrow : ");
			withdrow = sc.nextInt();

			if (withdrow % 100 != 0) {
				System.out.println("Please Enter Amount Multiplus  ₹100 : ");
			} else if (withdrow > (this.balance - 3000)) {
				System.out.println("INSUFFISENT BALANCE........");
			} else {
				if (withdrow <= 10000) {
					this.balance = this.balance - withdrow;
					System.out.println("PLEASE COLLECT YOUR CASH......");
					System.out.println();
					System.out.println("Clear balance is : " + balance);

				} else {
					System.out.println("PLEASE ENTER VALID AMOUNT :");
				}
			}
		}
	}

	public void getIntrest() {

		System.out.println("SAVING ACCOUNT HOLDER GET ANNUALLY 4.90% INTREST : ");

		System.out.println();

		intrest = (this.balance * this.intrestRate * this.intrestYear) / 100;

		System.out.println("YOUR INTREST IS : " + this.intrest);

		this.balance = (int) (this.balance + this.intrest);

		System.out.println("After getting intrest your updating balance is : " + this.balance);
	}

	public void ShowDetails() {

		System.out.print("PLEASE ENTER YOUR PIN : ");
		int pin = sc.nextInt();
		if (pin != 9844) {
			System.out.print("YOU ENTER WRONG PIN NUMBER : ");
		} else {

			System.out.println();
			System.out.print("Enter Account number you want to search : ");
			int AccountNumber = sc.nextInt();

			System.out.println();
			if (AccountNumber == this.accNumber) {
				System.out.println("========YOUR ACCOUNT DETAILS========= ");

				System.out.println();

				System.out.println("Account Holder Name : " + this.name);
				System.out.println("Account Number : " + this.accNumber);
				System.out.println("Bank Balance : " + this.balance);

			}

			else {
				System.out.println("You Enter Wrong Account Number ");
			}
		}
	}
}

class CurrentAccount extends RBI {
	Scanner sc = new Scanner(System.in);

	int pin = sc.nextInt();

	public void OpenAccount(String name, int accNumber , double balance) {
		
		this.name = name;
		this.accNumber = accNumber;
		this.balance = balance;

		
	}

	public void Diposit() {

		int diposit;
		System.out.print("PLEASE ENTER YOUR PIN : ");
		int pin = sc.nextInt();
		if (pin != 8787) {
			System.out.println("YOU ENTER WRONG PIN NUMBER : ");
		} else {

			System.out.print("Enter Amount you want to diposit : ");
			diposit = sc.nextInt();

			System.out.println();

			this.balance = diposit + this.balance;

			System.out.println("Clear balance is : " + this.balance);
		}
	}

	public void Withdrow() {
 
		int withdrow;
		System.out.println("PLEASE ENTER YOUR PIN : ");
		int pin = sc.nextInt();
		System.out.println();
		if (pin != 8787) {
			System.out.println("YOU ENTER WRONG PIN NUMBER : ");
		} else {

			System.out.println("CURRENT ACCOUNT PER ONE TRANSACTION WITHDROW LIMIT IS 20,000 RS. : ");
			System.out.println();

			System.out.println("Enter Amount you want to withdrow : ");
			withdrow = sc.nextInt();

			if (withdrow % 100 != 0) {
				System.out.println("Please Enter Amount Multiplus  ₹100 : ");
			} else if (withdrow > (this.balance - 10000)) {
				System.out.println("INSUFFISENT BALANCE........");
			} else {
				if (withdrow <= 20000) {
					this.balance = this.balance - withdrow;
					System.out.println("PLEASE COLLECT YOUR CASH......");
					System.out.println();
					System.out.println("Clear balance is : " + this.balance);
				} else {
					System.out.println("PLEASE ENTER VALID AMOUNT :");
				}
			}
		}
	}

	public void ShowDetails() {

		System.out.println("PLEASE ENTER YOUR PIN : ");
		int pin = sc.nextInt();
		System.out.println();
		if (pin != 8787) {
			System.out.println("YOU ENTER WRONG PIN NUMBER : ");
		} else {

			System.out.println();
			System.out.println("Enter Account number you want to search : ");
			int AccountNumber = sc.nextInt();
			if (AccountNumber == this.accNumber) {
				System.out.println("======YOUR ACCOUNT DETAILS========= ");

				System.out.println();

				System.out.println("Account Holder Name : " + this.name);
				System.out.println("Account Number : " + this.accNumber);
				System.out.println("Bank Balance : " + this.balance);

			}

			else {
				System.out.println("You Enter Wrong Account Number ");
			}
		}
	}

}

public class As16_bank_fanctionality {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choice;
		char chose;

		System.out.println("Chose bank for open account : ");
		System.out.println();
		System.out.println("1 . HDFC BANK");
		System.out.println("2 . KOTAK BANK");
		System.out.println();
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();

		switch (choice) {
		case 1: {
			System.out.println();
			System.out.println("1. Saving Account : ");
			System.out.println("2. Cuurent Account : ");
			System.out.println();
			System.out.print("Enter your choice : ");
			int option = sc.nextInt();

			switch (option) {
			case 1: {
				do {

					System.out.println("1. Diposit Amount : ");
					System.out.println("2. Withdrow Account : ");
					System.out.println("3. Intrest Amount : ");
					System.out.println("4. See information : ");
					System.out.print("Enter your choice : ");
					int Option = sc.nextInt();

					SavingAccount sa = new SavingAccount();
					switch (Option) {
					
					case 1: {
						sa.Diposit();
					}
						break;

					case 2: {
						sa.Withdrow();
					}
						break;

					case 3: {
						sa.getIntrest();
					}
						break;
					case 4: {
						sa.ShowDetails();
					}
						break;
					}
					System.out.println();
					System.out.println("DO YOU WANT OTHER TRANSACTION (Y/N) : ");
					chose = sc.next().charAt(0);
				} while (chose == 'y' || chose == 'Y');
				System.out.println("THANLS YOU FOR USING OUR SERVICE..............");
			}
				break;

			case 2: {
				do {

					System.out.println("1. Diposit Amount : ");
					System.out.println("2. Withdrow Account : ");
					System.out.println("3. See information : ");
					System.out.print("Enter your choice : ");
					int Choice = sc.nextInt();

					CurrentAccount ca = new CurrentAccount();

					switch (Choice) {
				
					case 1: {
						ca.Diposit();
						break;
					}

					case 2: {
						ca.Withdrow();
						break;
					}
					case 3: {
						ca.ShowDetails();
						break;
					}

					default: {
						System.out.println("Invalid choice");
						break;
					}
					}
					System.out.println();
					System.out.println("DO YOU WANT OTHER TRANSACTION (Y/N) : ");
					chose = sc.next().charAt(0);
				} while (chose == 'y' || chose == 'Y');
				System.out.println("THANLS YOU FOR USING OUR SERVICE..............");
			}
			}
		}
			break;

		case 2: {
			System.out.println("1. Saving Account : ");
			System.out.println("2. Cuurent Account : ");

			System.out.print("Enter your choice : ");
			int option = sc.nextInt();

			switch (option) {
			case 1: {
				do {

					System.out.println("1. Diposit Amount : ");
					System.out.println("2. Withdrow Account : ");
					System.out.println("3. intrest Amount : ");
					System.out.println("4. See information : ");
					System.out.print("Enter your choice : ");
					int Option = sc.nextInt();

					SavingAccount sa = new SavingAccount();

					switch (Option) {

				
					case 1: {
						sa.Diposit();
						break;
					}

					case 2: {
						sa.Withdrow();
						break;
					}

					case 3: {
						sa.getIntrest();
						break;
					}
					case 4: {
						sa.ShowDetails();
						break;
					}
					default: {
						System.out.println("Invalid Choice............ ");
						break;
					}
					}
					System.out.println();
					System.out.println("DO YOU WANT OTHER TRANSACTION (Y/N) : ");
					chose = sc.next().charAt(0);
				} while (chose == 'y' || chose == 'Y');
				System.out.println("THANLS YOU FOR USING OUR SERVICE..............");
			}
				break;

			case 2: {
				do {

					System.out.println("0. Open Account : ");
					System.out.println("1. Diposit Amount : ");
					System.out.println("2. Withdrow Account : ");
					System.out.println("3. See information : ");
					System.out.print("Enter your choice : ");
					int Choice = sc.nextInt();

					CurrentAccount ca = new CurrentAccount();
					switch (Choice) {

					case 0: {
						ca.OpenAccount("Rahul_kathiriya",123456,50000.00);
						break;
					}

					case 1: {
						ca.Diposit();
					}
						break;

					case 2: {
						ca.Withdrow();
					}
						break;
					case 3: {
						ca.ShowDetails();
					}
						break;
					}
					System.out.println();
					System.out.println("DO YOU WANT OTHER TRANSACTION (Y/N) : ");
					chose = sc.next().charAt(0);
				} while (chose == 'y' || chose == 'Y');
				System.out.println("THANLS YOU FOR USING OUR SERVICE..............");

			}
			}
		}
			break;

		default: {
			System.out.println("Invalid Choice................");
		}
		}

	}

}
