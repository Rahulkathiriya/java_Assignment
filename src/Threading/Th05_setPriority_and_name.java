package Threading;

class setNamePriority extends Thread {

	public void run() {

		for (int i = 0; i < 5; i++) {
			
			System.out.println( currentThread().getName()+" : "+i*i);

		}

	}
}

public class Th05_setPriority_and_name {

	public static void main(String[] args) {

		setNamePriority firstOne = new setNamePriority();
		setNamePriority secondOne = new setNamePriority();
		
		firstOne.setName("ONE");
		secondOne.setName("SECONS");
		
		firstOne.setPriority(Thread.MAX_PRIORITY);
		secondOne.setPriority(Thread.MIN_PRIORITY);
		
		firstOne.start();
		secondOne.start();
		
		
	}

}
