import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Abc implements Runnable {
	ReentrantLock rLock = new ReentrantLock();

	public void run() {

		try {
			if (rLock.tryLock(4, TimeUnit.SECONDS)) {
				for (int i = 0; i <= 20; i++) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
					try {
						Thread.sleep(100);

					} catch (Exception e) {
						System.out.println(e);
					}
				}
				rLock.unlock();
			} else {
				System.out.println("Cant Wait  : " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ConcurrencyDemo {
	public static void main(String[] args) {

		Abc a1 = new Abc();

		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a1);
		Thread t3 = new Thread(a1);

		t1.start();
		t2.start();
		t3.start();

	}
}
