package Lesson;

import java.util.Scanner;

public class ThreadInterrupt {

	public static void main(String[] args) {
		Thread counter = new Counter();
		counter.start();
		
		Scanner in = new Scanner(System.in);
		String s = "";
		
		while(!s.equals("stop")) { //while user input isn't "stop"
			s = in.next();
		}
		
		counter.interrupt(); //interrupt the thread
		in.close();
	}

}

class Counter extends Thread{
	public void run() {
		int count = 0;
		while(!isInterrupted()) { //test whether the thread is interrupted
			System.out.println(this.getName() + " Count is " + count);
			count++;
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				break;
			}
		}
		System.out.println("Counter Interrupted");
	}
}