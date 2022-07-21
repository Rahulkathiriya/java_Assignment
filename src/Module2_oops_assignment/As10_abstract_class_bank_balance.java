package Module2_oops_assignment;

import java.util.Scanner;

abstract class Bank {

	public abstract void bankBalance();
}

class Bank_HDFC extends Bank {

	@Override
	public void bankBalance() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter balance amount : ");
		int balance = sc.nextInt();

		System.out.println("YOUR HDFC BANK ACCOUNT BALANCE IS : $" + balance);

	}
}

class Bank_ICICI extends Bank {

	@Override
	public void bankBalance() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter balance amount : ");
		int balance = sc.nextInt();

		System.out.println("YOUR ICICI BANK ACCOUNT BALANCE IS : $" + balance);

	}
}

class Bank_Kotak extends Bank {

	@Override
	public void bankBalance() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter balance amount : ");
		int balance = sc.nextInt();

		System.out.println("YOUR KOTAK BANK ACCOUNT BALANCE IS : $"+ balance);

	}
}

public class As10_abstract_class_bank_balance {

	public static void main(String[] args) {
		
		
		Bank_HDFC hd = new Bank_HDFC();
		hd.bankBalance();
		
		Bank_ICICI ic = new Bank_ICICI();
		ic.bankBalance();
		
		Bank_Kotak kt = new Bank_Kotak();
		kt.bankBalance();

	}

}
