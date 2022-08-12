package Threading;

class sameThread extends Thread {

	public void run() {

		String name = "Rahul kathiriya";
		String curse = "Java developer";
		String email = "rahul@gmail.com";
		int age = 21;
		int number = 704696;

		System.out.println("Name : " + name);
		System.out.println("Curse : " + curse);
		System.out.println("age : " + age);
		System.out.println("Mobile Numebr : " + number);
		System.out.println("Email Address : " + email);

	}

}

public class Th04_CallSameName {

	public static void main(String[] args) {

		
		sameThread isSame = new sameThread();
		
		
		isSame.start();
		isSame.start();
	}

}
