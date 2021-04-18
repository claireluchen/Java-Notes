import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
Create an ArrayBlockingQueue to store integers 
Producer thread puts an integer into the queue
Consumer thread takes an integer from the queue
This program does not need locks and conditions to synchronize Producer and Consumer since it's already implemented in ArrayBlockingQueue
 */
public class ReadWriteBlockingQueue {
	//create a buffer of blocking queue
	private static ArrayBlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(2); //capacity is 2
	
	public static void main(String[] args) {
		//create a thread pool with two threads
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(new ProducerTask());
		executor.execute(new ConsumerTask());
		executor.shutdown();
		
	}
	
	//a task for adding an int to the buffer
	private static class ProducerTask implements Runnable{
		public void run() {
			try {
				int i = 1;
				while (true) {
					System.out.println("Producer writes " + i);
					buffer.put(i); //add the value into the buffer
					//put the thread to sleep
					Thread.sleep((int) (Math.random()  * 1000));
					i++;
				}
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	//a task for reading and deleting an int from the buffer
	private static class ConsumerTask implements Runnable{
		public void run() {
			try {
				while (true) {
					System.out.println("\t\t\tConsumer reads " + buffer.take());
					//put the thread to sleep
					Thread.sleep((int) (Math.random() * 1000));
				}
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

}
