package Threading;

class simpleClass {
	String name;
	int age;

	public simpleClass(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

}

class threadclass extends simpleClass implements Runnable {
	public threadclass(String name, int age) {
		super(name, age);
	}

	public void run() {
		System.out.println("Runnable Run class is Running....");

	}

}

 public class TH01_startMethod {

	public static void main(String[] args) {

		threadclass tc = new threadclass("Rahul kathiriya", 21);

		Thread t1 = new Thread(tc);
		t1.start();

	}

}
