package Asssignment_queastion;

import java.util.Scanner;

public class As13_n_nn_nnn_integer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter N number : ");
		int n = sc.nextInt();
		
		int a = n;
		int b = n*10+n;
		int c = n*110+n;
		
		System.out.print(a+" + "+b+" + "+c);
		
		System.out.println();
		System.out.println("=========================================");
		System.out.println();
		
		System.out.print("Enter N1 number : ");
		int n1 = sc.nextInt();
		
		int a1 = n1;
		int b1 = n1*100+n1;
		int c1 = n1*10100+n1;
		
		System.out.print(a1+" + "+b1+" + "+c1);
		System.out.println();
		System.out.println("=========================================");
		System.out.println();
		
		System.out.print("Enter N1 number : ");
		int n2 = sc.nextInt();
		
		int a3 = n2;
		int b3 = n2*1000+n2;
		int c3 = n2*1001000+n2;
		
		System.out.print(a3+" + "+b3+" + "+c3);
	}

}
