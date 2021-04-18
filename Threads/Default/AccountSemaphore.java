import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;


public class AccountSemaphore {
	private static Account account = new Account();
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		
		//create and launch 100 threads
		for (int i = 0; i < 100; i++) {
			executor.execute(new AddAPennyTask());
		}
		
		executor.shutdown();
		
		//wait until all tasks are finished
		while (! executor.isTerminated()) {
			
		}
		
		System.out.println(account.getBalance());	
		
	}
	
	//a thread for adding a penny to the account
	public static class AddAPennyTask implements Runnable{
		public void run() {
			account.deposit(1);
		}
	}
	
	//inner class for Account
	private static class Account{
		//Create a semaphore
		private static Semaphore semaphore = new Semaphore(1);
		private int balance = 0;
		
		public int getBalance() {
			return balance;
		}
		
		public void deposit(int amount) {
			try {
				semaphore.acquire(); //acquire a permit
				balance += amount;
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}finally {
				semaphore.release(); //release a permit
			}
		}
		
	}

}
