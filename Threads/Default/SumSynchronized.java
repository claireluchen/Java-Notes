/*
synchronization
launches 50 threads, using a thread pool (executer)
each thread adds 1 to a variable named sum (initialized to zero)
print out the sum
define a static Sum inner class that adds to the sum and can get the sum
define a static AddToSum class that implements the run() method in Runnable interface, to be used by the executor
 */
public class SumSynchronized{
	//create a sum object using Sum's default constructor
	//to be used in this class
	private static Sum sumObj = new Sum();
	
	public static void main(String[] args) {
		Thread thread = null;
		for (int i = 0; i < 50; i++) { //loop 50 times
			thread = new Thread(new AddToSum()); //passing AddToSum to the Thread constructor
			thread.start(); //start the thread
//			try {
//				Thread.sleep(20);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		
		System.out.println(sumObj.getSum());
		
	}
	
	//task, thread for adding 1 to the sum
	private static class AddToSum implements Runnable{
		@Override //overrides the run() method in Runnable interface
		public void run() {
			sumObj.add(1); //add 1 to the sum
		}
	}
	
	//inner class
	private static class Sum{
		private int sum = 0; //belongs to the whole class
		
		public int getSum() { //get the sum
			return sum;
		}
		
		public synchronized void add(int num) { //add to sum
			sum += num;
			System.out.println("Sum is " + sumObj.getSum()); //print out the sum
		}
	}	
	
}