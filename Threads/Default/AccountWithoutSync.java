import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountWithoutSync {
	private static Account account = new Account();
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool(); //create executor
		
		//create and launch 100 threads
		for (int i = 0; i < 100; i++) {
			executor.execute(new AddAPennyTask());
		}
		
		//shut down the executor, no new task accepted
		executor.shutdown();
		 
		//wait until all tasks are finished
		while (!executor.isTerminated()) {
			
		}
		
		//get the balance
		System.out.println("The balance is : " + account.getBalance());
		
	}
	
	//a thread for adding a penny to the account
	private static class AddAPennyTask implements Runnable{
		public void run() {
			account.deposit(1);
		}
	}
	
	//an inner class for account
	private static class Account{
		private int balance = 0;
		
		public int getBalance() {
			return balance;
		}
		
		public void deposit(int amount) {
			int newBalance = balance + amount;
			balance = newBalance;
		}		
		
	}

}
