package module4;

class MyClass extends Thread {
	
	public void method1() {
		System.out.println("This is a method 1.");
	}

	public void method2() {
		System.out.println("This is a method 2.");
	}
	
	public void run() {
		method1();
		method2();
		@SuppressWarnings("deprecation")
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		
		System.out.println("ID is: " + id);
		System.out.println("name is: " + name);
	}
}

public class MultithreadingDemo {

	public static void main(String[] args) {
		System.out.println("Create a Thread.");
		for(int i = 0; i <= 5; i++) {
			MyClass obj = new MyClass();
			obj.start();
		}
	}
}
