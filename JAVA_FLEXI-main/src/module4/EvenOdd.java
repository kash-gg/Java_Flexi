package module4;

class MultiThreadingEvenOdd implements Runnable {
	private static boolean flag = true;

	@Override
	public void run() {
		if (flag == true) {
			flag = false;
			printEven();
		}
		else {
			printOdd();
		}
		
	}
	
	public synchronized void printEven() {
		@SuppressWarnings("deprecation")
		long id = Thread.currentThread().getId();
		for(int i = 0; i <= 10; i+=2) {
			System.out.println(i + "\t ~ Thread id is : " + id);
		}
	}
	
	public synchronized void printOdd() {
		@SuppressWarnings("deprecation")
		long id = Thread.currentThread().getId();
		for(int i = 1; i <= 10; i+=2) {
			System.out.println(i + "\t ~ Thread id is : " + id);
		}
		flag = true;
	}
	
}

public class EvenOdd {

	public static void main(String[] args) {
		try {
		MultiThreadingEvenOdd multith = new MultiThreadingEvenOdd();
		Thread evenThread = new Thread(multith);
		evenThread.setPriority(2);
		Thread oddThread = new Thread(multith);
		oddThread.setPriority(5);
		evenThread.start();
		oddThread.start();
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}


