package practice;

class MyClass1 implements Runnable {
	public void method1() {
		System.out.println("This is Method 1.");
	}
	public void method2() {
		System.out.println("This is Method 2.");
	}
	
	@Override
	public void run() {
		method1();
		method2();
		
		long id  = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		
		System.out.println("Thread Id: " + id);
		System.out.println("Thread Name: " + name);
	}
}

public class MultiThreading_Interface {

	public static void main(String[] args) {
		System.out.println("Thread is Created.");
		MyClass1 obj = new MyClass1();
		Thread thread1 = new Thread(obj);
		thread1.start();

	}

}
