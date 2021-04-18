package Lesson;

public class ThreadSleep {
	public static void main(String[] args) {
		Thread thread1 = new CountDownEven3();
		Thread thread2 = new CountDownOdd3();
		thread1.start();
		thread2.start();
	}
}

class CountDownOdd3 extends Thread{
	public void run() {
		for (int i = 9; i > 0; i -= 2) {
			System.out.println(getName() + " Count is " + i);
			try {
				//thread will sleep for at least 400 millisecond
				Thread.sleep(800); //might throw Interrupted Exception, a checked exception
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class CountDownEven3 extends Thread{
	public void run() {
		for (int i = 10; i > 0; i -= 2) {
			System.out.println(getName() + " Count is " + i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}