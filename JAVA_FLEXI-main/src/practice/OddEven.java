package practice;

class MyClass2 implements Runnable {
	public static boolean flag = true;
	
	@Override
	public void run() {
		if(flag == true) {
			flag = false;
			printOdd();
		}
		else {
			printEven();
		}
	}
	
	public synchronized void printOdd() {
		long id = Thread.currentThread().getId();
		for(int i = 1; i < 10; i = i + 2) {
			System.out.println(i + "~\tThread ID: " + id);
		}
	}
	
	public synchronized void printEven() {
		long id  = Thread.currentThread().getId();
		for(int i = 0; i < 10; i = i + 2) {
			System.out.println(i + "~\tThread ID: " + id);
		}
		flag = true;
	}
}

public class OddEven {

	public static void main(String[] args) {
		System.out.println("Threads is Created.");
		try {
			MyClass2 obj = new MyClass2();
			Thread oddThread = new Thread(obj);
			oddThread.setPriority(2);
			Thread evenThread = new Thread(obj);
			evenThread.setPriority(5);
			oddThread.start();
			evenThread.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}