package practice;

class MyClass3 implements Runnable {
	public static boolean flag = true;
	
	@Override
	public void run() {
		if(flag  == true) {
			flag = false;
			printName();
		}
		else {
			printPrime();
		}
	}
	
	public synchronized void printName() {
		long id  = Thread.currentThread().getId();
		for(int i = 0; i < 5; i++) {
			System.out.println("Shivam");
		}
	}
	
	public synchronized void printPrime() {
		long id = Thread.currentThread().getId();
		for(int i = 2; i <= 10; i++) {
			boolean isPrime = true;
			for(int j = 2; j <= i/2; j++) {
				if(i % j == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
	}
}

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Thread is Created.");
		try {
			MyClass3 obj = new MyClass3();
			Thread primeThread = new Thread(obj);
			Thread nameThread = new Thread(obj);
			primeThread.start();
			nameThread.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
