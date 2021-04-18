import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountWithSyncUsingLock {
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
	
	//an inner class for Account
	public static class Account{
		private static Lock lock = new ReentrantLock(); //create a lock
		private int balance = 0;
		
		public int getBalance() {
			return balance;
		}
		
		public void deposit(int amount) {
			lock.lock(); //acquire the lock
			try {
				balance += amount;
			}catch(Exception ex) {
				System.out.println(ex);
			}finally {
				lock.unlock(); //release the lock
			}
		}
	}
	
}
