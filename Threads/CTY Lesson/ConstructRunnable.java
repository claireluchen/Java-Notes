package Lesson;

public class ConstructRunnable {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new CountDownEven2());
		Thread thread2 = new Thread(new CountDownOdd2());
		thread1.start();
		thread2.start();
	}

}

class CountDownOdd2 implements Runnable{
	public void run() {
		Thread t = Thread.currentThread();
		for (int i = 9; i > 0; i -= 2) {
			System.out.println(t.getName() + " Count is " + i);
			Thread.yield();
		}
	}
}

class CountDownEven2 implements Runnable{
	public void run() {
		Thread t = Thread.currentThread();
		for (int i = 10; i > 0; i -= 2) {
			System.out.println(t.getName() + " Count is " + i);
			Thread.yield();
		}
	}
}
