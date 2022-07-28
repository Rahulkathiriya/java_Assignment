package Module2_oops_assignment;

import java.util.Scanner;

public class RBIBank {

	protected String name;
	protected int accNumber;
	protected double balance;
	protected double intrestRate = 4.90;
	protected int intrestYear = 1;
	protected double intrest;
	protected int withdrow;
	protected int diposit;

	Scanner sc = new Scanner(System.in);

}

class Saving extends RBIBank {

	public Saving(String name, int accNumber, double balance) {
		this.name = name;
		this.accNumber = accNumber;
		this.balance = balance;
	}

	public void DipositMoney() {
		System.out.print("PLEASE ENTER YOUR PIN : ");
		int pin = sc.nextInt();
		if (pin != 9844) {
			System.out.println("YOU ENTER WRONG PIN NUMBER : ");
		} else {
			System.out.print("Enter Amount you want to diposit : ");
			diposit = sc.nextInt();

			this.balance = diposit + this.balance;

			System.out.println("Clear balance is : " + this.balance);
			System.out.println();

		}
	}

	public void WithdrowMoney() {
		System.out.print("PLEASE ENTER YOUR PIN : ");
		int pin = sc.nextInt();
		if (pin != 9844) {
			System.out.println("YOU ENTER WRONG PIN NUMBER : ");
		} else {
			System.out.println();
			System.out.println("SAVING ACCOUNT PER ONE TRANSACTION WITHDROW LIMIUT IS 10,000 RS. : ");
			System.out.println();

			System.out.print("Enter Amount you want to withdrow : ");
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
					System.out.println("Clear balance is : " + this.balance);

				} else {
					System.out.println("PLEASE ENTER VALID AMOUNT :");
				}
			}
		}
	}

	public void intrestAmount() {
		System.out.print("Enter Account Number : ");
		int accountNumber = sc.nextInt();
		if (accountNumber == accNumber) {

			System.out.println("SAVING ACCOUNT HOLDER GET ANNUALLY 4.90% INTREST : ");

			System.out.println();

			intrest = (this.balance * intrestRate * intrestYear) / 100;

			System.out.println("YOUR INTREST IS : " + intrest);

			this.balance = (this.balance + intrest);

			System.out.println("After getting intrest your updating balance is : " + this.balance);
		} else {
			System.out.println("Enter valid account number");
		}
	}

	public void showinformation() {

		System.out.println("Account holder Name : " + name);
		System.out.println("Account number : " + accNumber);
		System.out.println("Diposit Amount : " + diposit);
		System.out.println("Withdrow Amount : " + withdrow);
		System.out.println("Intrest amount : " + intrest);
		System.out.println("Clear balance : " + balance);
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAccNumber() {
//		return accNumber;
//	}
//
//	public void setAccNumber(int accNumber) {
//		this.accNumber = accNumber;
//	}
//
//	public double getBalance() {
//		return balance;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}

}

class Current extends RBIBank {
	public Current(String name, int accNumber, double balance) {
		this.name = name;
		this.accNumber = accNumber;
		this.balance = balance;
	}

	public void Diposit() {

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

		System.out.print("PLEASE ENTER YOUR PIN : ");
		int pin = sc.nextInt();
		System.out.println();
		if (pin != 8787) {
			System.out.println("YOU ENTER WRONG PIN NUMBER : ");
		} else {

			System.out.println("CURRENT ACCOUNT PER ONE TRANSACTION WITHDROW LIMIT IS 20,000 RS. : ");
			System.out.println();

			System.out.print("Enter Amount you want to withdrow : ");
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

		System.out.print("PLEASE ENTER YOUR PIN : ");
		int pin = sc.nextInt();
		System.out.println();
		if (pin != 8787) {
			System.out.println("YOU ENTER WRONG PIN NUMBER : ");
		} else {

			System.out.println();
			System.out.print("Enter Account number you want to search : ");
			int AccountNumber = sc.nextInt();
			if (AccountNumber == this.accNumber) {
				System.out.println();
				System.out.println("======== YOUR ACCOUNT DETAILS ========= ");

				System.out.println();

				System.out.println("Account Holder Name : " + name);
				System.out.println("Account Number : " + accNumber);
				System.out.println("Diposited Amount : " + diposit);
				System.out.println("Withdrow Amount : " + withdrow);
				System.out.println("Bank Balance : " + balance);

			}

			else {
				System.out.println("You Enter Wrong Account Number ");
			}
		}
	}

}
