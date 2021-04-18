
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
with synchronization
launches 50 threads, using a thread pool (executer)
each thread adds 1 to a variable named sum (initialized to zero)
print out the sum
define a static Sum inner class that adds to the sum and can get the sum
define a static AddToSum class that implements the run() method in Runnable interface, to be used by the executor
 */
public class SumSynchronizedExecutor {
	//create a sum object using Sum's default constructor
	//to be used in this class
	private static Sum sum = new Sum();
	
	public static void main(String[] args) {
		//create an executer
		ExecutorService executor = Executors.newCachedThreadPool(); //creates new threads as needed
		
		//launch 50 threads
		for (int i = 0; i < 50; i++) {
			executor.execute(new AddToSum());
//			System.out.println(sum.getSum());
		}
		
		//shut down the executer so that it doesn't accept new tasks
		executor.shutdown();
		
		while (!executor.isTerminated()) {
			//allow for all of the tasks in the executor to be completed before printing out the result
		}
		
		//print out the sum
		System.out.println(sum.getSum()); 
	}
	
	//task, thread for adding 1 to the sum
	private static class AddToSum implements Runnable{
		//overrides the run() method in Runnable interface
		@Override
		public void run() {
			synchronized (sum) { //synchronized statement
				sum.add(1); //add 1 to the sum
			}
		}
	}
	
	//inner class for sum
	private static class Sum{
		//create a lock
		private static Lock lock = new ReentrantLock();
		private int sum = 0; //belongs to the whole class
		
		public int getSum() { //get the sum
			return sum;
		}
		
		public synchronized void add(int num) { //add to sum, synchronized
			lock.lock(); //uses the lock for synchronization
			try {
				sum += num;
			}catch(Exception ex) {
				System.out.println(ex);
			}finally {
				lock.unlock(); //release the lock
			}
			
		}
	}	
	
}
