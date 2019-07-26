class A extends Thread {
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.println("i -" + i);
			try {

				Thread.sleep(1000);

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class B extends Thread {
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.println("j -" + i);
			try {

				Thread.sleep(1000);

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class C extends Thread {
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.println("k -" + i);
			try {

				Thread.sleep(1000);

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {

		A a1 = new A();
		B b1 = new B();
		C c1 = new C();

		a1.start();
		b1.start();
		c1.start();
		
		a1.setName("Sheldon");
		a1.setPriority(1);
		b1.setName("Amy");
		b1.setPriority(2);
		c1.setName("Leonard");
		c1.setPriority(3);
		
		Thread m1 = Thread.currentThread();
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(m1);

		System.out.println("Main Exit!");

	}

}