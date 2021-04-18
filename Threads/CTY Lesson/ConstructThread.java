package Lesson;
/*
Construct a Thread by extending the Thread class
 */
public class ConstructThread {

	public static void main(String[] args) {
		Thread thread1 = new CountDownEven();
		Thread thread2 = new CountDownOdd();
		//the program never explicitly calls the run() method
		//after calling start() method, it makes them runnable, and the Java thread scheduler takes over and calls each thread's run() method
		thread1.start(); //make them runnable
		thread2.start();
	}	

}

class CountDownOdd extends Thread{
	@Override
	public void run() {
		for (int i = 9; i > 0; i -= 2) {
			System.out.println(this.getName() + " Count is " + i); //get the name of this thread and print out i
			Thread.yield(); //cause the thread to pause and let another thread to execute
		}
	}	
}

class CountDownEven extends Thread{
	@Override
	public void run() {
		for (int i = 10; i > 0; i -= 2) {
			System.out.println(this.getName() + " Count is " + i); //get the name of this thread and print out i
			Thread.yield(); //cause the thread to pause and let another thread to execute
		}
	}
}
