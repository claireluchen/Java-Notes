import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Use a buffer to store integers and the buffer size is limited
write(int) writes to the buffer and read() reads and delete
to synchronize the operations, use a lock with two condition: notEmpty, notFull
when task adds to the buffer if the buffer is full, wait for the notFull condition
when task reads from the buffer if the buffer is empty, wait for notEmpty condition
 */
public class ReadWriteBufferModified {
	private static Buffer buffer = new Buffer();
	
	public static void main(String[] args) {
		//create a thread pool with two threads
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(new ProducerTask());
		executor.execute(new ConsumerTask());
		executor.shutdown();
	}
	
	//task for adding an int to the buffer
	private static class ProducerTask implements Runnable{
		@Override
		public void run() {
			try {
				int i = 1;
				int count = 0;
				while (count < 50) {
					System.out.println("Producer writes " + i);
					buffer.write(i++);
					//put thread into sleep
					Thread.sleep((int) (Math.random() * 1000));
					count++;
				}
			}catch(InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}
	
	//task for reading and deleting an int from the buffer
	private static class ConsumerTask implements Runnable{
		public void run() {
			try {
				int count = 0;
				while(count < 50) {
					System.out.println("\t\t\tConsumer reads " + buffer.read());
					//put the thread to sleep
					Thread.sleep((int) (Math.random() * 1000));
					count++;
				}
			}catch(InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}
	
	//an inner class for buffer
	private static class Buffer{
		private static final int CAPACITY = 2; //buffer size
		private LinkedList<Integer> queue = new LinkedList<>();
		
		//create a new lock
		private static Lock lock = new ReentrantLock();
		
		//create two conditions
		private static Condition notEmpty = lock.newCondition(); //true if there is element in the queue
		private static Condition notFull = lock.newCondition(); //true if the queue is not full
		
		public void write(int value) { //write
			lock.lock(); //acquire the lock
			try {
				while(queue.size() == CAPACITY) {
					System.out.println("Wait for notFull condition");
					notFull.await(); //wait for notFull condition to become true
				}
				//once the queue is not full
				queue.offer(value); //add the value into the queue
				if (queue.size() > 0) {
					notEmpty.signal(); //signal notEmpty condition
				}
			}catch(InterruptedException ex) {
				System.out.println(ex);
			}finally {
				lock.unlock();
			}			
		}
		
		@SuppressWarnings("finally")
		public int read() { //read method
			int value = 0;
			lock.lock(); //acquire the lock
			try {
				while(queue.isEmpty()) {
					System.out.println("\t\t\tWait for notEmpty condition");
					notEmpty.await(); //waiting for notEmpty condition to be true
				}
				//once the queue is not empty
				value = queue.remove(); //remove the value
				
				if (queue.size() != CAPACITY) {
					notEmpty.signal(); //signal notFull condition
				}
			}catch(InterruptedException ex) {
				System.out.println(ex);
			}finally {
				lock.unlock(); //release the lock
				return value;
			}
		}
		
	}
	
}
