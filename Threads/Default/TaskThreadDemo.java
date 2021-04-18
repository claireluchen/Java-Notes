//Creates three tasks and have them run concurrently
public class TaskThreadDemo {

	public static void main(String[] args) {
		//create tasks
		Runnable printA = new PrintChar('a', 100);
		Runnable printB = new PrintChar('b', 100);
		Runnable print50 = new PrintNum(50);
		
		//create threads
		Thread thread1 = new Thread(printA);
		Thread thread2 = new Thread(printB);
		Thread thread3 = new Thread(print50);
		
		//start threads
		thread1.start();
		thread2.start();
		thread3.start();
	}

}

//task class for printing a character a specified number of times
class PrintChar implements Runnable{
	private char charToPrint; //the char to print
	private int times; //number of times to print
	public PrintChar(char c, int t) {
		charToPrint = c;
		times = t;
	}
	
	@Override
	//override the run() method to tell the system what task to perform
	public void run() {
		try {
			for (int i = 0; i < times; i++) {
				System.out.print(charToPrint);
				if (i >= 50) {
					Thread.sleep(1); //the thread of this task is put to sleep for 1 millisecond
				}
			}
		}  catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

//task class for printing numbers from 1 to n for a given n
class PrintNum implements Runnable{
	private int lastNum;
	public PrintNum(int num) {
		lastNum = num;
	}
	@Override
	public void run() {
		for (int i = 1; i <= lastNum; i++) {
			System.out.print(i + " ");
			Thread.yield(); //temporarily release time for other threads
		}
	}
}