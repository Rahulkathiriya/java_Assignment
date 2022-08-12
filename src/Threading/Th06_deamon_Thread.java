package Threading;

class daemonThread extends Thread {

	String name;

	public daemonThread(String name) {

		super(name);
	}

	public void run() {

		System.out.println("Thread name: " + Thread.currentThread().getName());
		System.out.println("Check if its DaemonThread: " + Thread.currentThread().isDaemon());

	}

}

public class Th06_deamon_Thread {

	public static void main(String[] args) {

		daemonThread isdaemon = new daemonThread("One");
		daemonThread isdaemon1 = new daemonThread("Second");
		
		
		try {
			isdaemon.start();
			isdaemon.setDaemon(true);
		} catch (IllegalThreadStateException e) {
			e.printStackTrace();
		}
		
		
		isdaemon1.setDaemon(true);
		isdaemon1.start();

	}

}
