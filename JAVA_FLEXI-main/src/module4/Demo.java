package module4;

class heya implements Runnable {
	private static boolean flag = true;

	@Override
	public void run() {
		if (flag) {
			flag = false;
			printName();
		} else {
			printPN();
		}
	}

	public void printName() {
		long id = Thread.currentThread().getId();
		for (int i = 0; i <= 10; i++) {
			System.out.println("KAPUSHION " + "\t ~ Thread id is : " + id);
		}
	}

	public void printPN() {
		long id = Thread.currentThread().getId();
		for (int i = 2; i <= 30; i++) {
			if (isPrime(i)) {
				System.out.println(i + "\t ~ Thread id is : " + id);
			}
		}
		flag = true;
	}

	private boolean isPrime(int num) {
		if (num < 2) return false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
}

public class Demo {

	public static void main(String[] args) {
		heya multith = new heya();
		Thread thread1 = new Thread(multith);
		Thread thread2 = new Thread(multith);
		
		thread1.start();
		thread2.start();
	}
}
