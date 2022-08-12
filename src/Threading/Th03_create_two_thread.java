package Threading;

class isThread extends Thread {

	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(currentThread().getName()+" : "+i * i);
		}

	}

}

class isNotTHread extends Thread{
	
	
	public void run() {
		
		for(int i=0;i<5;i++)
		{
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(currentThread().getName()+" : "+(i+i));
		}
		
		
		
	}
}

public class Th03_create_two_thread {

	public static void main(String[] args) {
		
		isThread th1 = new isThread();
		isNotTHread th2 = new isNotTHread();
		
		th1.setName("One");
		th2.setName("Two");
		th1.start();
		th2.start();
		
		
		

	}

}
