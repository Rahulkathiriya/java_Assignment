package Module2_oops_assignment;

import java.util.Scanner;

abstract class Parents {
	public abstract void messege();
}

class Sub extends Parents {

	@Override
	public void messege() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String 1 : ");
		String name = sc.nextLine();

		System.out.print("Enter String 2 : ");
		String sarName = sc.nextLine();
		System.out.println("This is the FIRST SUB class with my name : ");
		System.err.println(name + " " + sarName);

		System.out.println("======================================================");
	}
}

 class SecSub extends Parents {
	@Override
	public void messege() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value for A : ");
		int a = sc.nextInt();

		System.out.print("Enter value for B : ");
		int b = sc.nextInt();

		System.out.println("This is the SECOND SUB CLASS with this addition : ");

		System.err.println("Addition of "+ a +" + " + b +" is : "+(a+b));

	}
}

public class As09_absract_class_2sub_class {

	public static void main(String[] args) {

		Sub sb = new Sub();
		sb.messege();
		
		
		SecSub sec = new SecSub();
		sec.messege();
	
		
	}

}
