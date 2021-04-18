package Lesson;
/*
if two threads are ready to run, the one with the highest priority is run first (should finish first)
if two threads of equal priority are ready to run, the scheduler determines which to run first, and this is implementation dependent
 */
public class ThreadPriority {

	public static void main(String[] args) {
		Thread thread1 = new CountDownEven4();
		Thread thread2 = new CountDownOdd4();
		thread1.setPriority(Thread.MIN_PRIORITY); //1
		thread2.setPriority(Thread.MAX_PRIORITY); //10, NORM_PRIORITY = 5
		thread1.start();
		thread2.start();
		
	}

}

class CountDownOdd4 extends Thread{
	public void run() {
		for (int i = 9; i > 0; i -= 2) {
			System.out.println(getName() + " Count is " + i);
			Thread.yield();
		}
	}
}

class CountDownEven4 extends Thread{
	public void run() {
		for (int i = 10; i > 0; i -= 2) {
			System.out.println(getName() + " Count is " + i);
			Thread.yield();
		}
	}
}