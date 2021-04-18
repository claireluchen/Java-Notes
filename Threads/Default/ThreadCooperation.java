import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Conditions can be used to facilitate communications among threads; a thread can specify what to do under a certain condition.
- deposit into an account
- withdraws from the account
- the withdraw task has to wait if the amount to be withdrawn is more than the current balance
- when new funds are deposited into the account, the deposit task notifies the withdraw thread to resume
 */
public class ThreadCooperation {
	private static Account account = new Account();
	
	public static void main(String[] args) {
		System.out.println("Thread 1\t\tThread 2\t\tBalance");
		//create a tread pool with two threads, for deposit and withdraw
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(new DepositTask());
		executor.execute(new WithdrawTask());
		executor.shutdown();		
		
	}
	
	//deposit task
	public static class DepositTask implements Runnable{
		@Override //keep adding an amount to the account
		public void run() {
			try { //purposely delay it to let the withdraw method proceed
				while(true) { 
					account.deposit((int) (Math.random() * 10) + 1);
					Thread.sleep(1000);
				}
			}catch(Exception ex) {
				System.out.println(ex);
			}
		}
	}
	
	//withdraw task
	public static class WithdrawTask implements Runnable{
		@Override //keep subtracting an amount from the account
		public void run() {
			while(true){
				account.withdraw((int)(Math.random() * 10) + 1);
			}
		}
	}
	
	//an inner class for account
	private static class Account{
		//create a new lock
		private static Lock lock = new ReentrantLock();
		
		//create a condition
		private static Condition newDeposit = lock.newCondition();
		
		private int balance = 0;
		
		public int getBalance() {
			return balance;
		}
		
		public void withdraw(int amount) {
			lock.lock(); //acquire the lock
			try {
				while (balance < amount) {
					System.out.println("\t\t\tWait for a deposit");
					newDeposit.await(); //wait on the condition
				}
				balance -= amount;
				System.out.println("\t\t\tWithdraw " + amount + "\t\t" + getBalance());
			}catch(Exception ex) {
				System.out.println("here");
				System.out.println(ex);
			}finally {
				lock.unlock(); //release the lock
			}
			
		}
		
		public void deposit(int amount) {
			lock.lock(); //acquire the lock
			try {
				balance += amount;
				System.out.println("Deposit " + amount + "\t\t\t\t\t" + getBalance());
				//signal thread waiting on the condition
				newDeposit.signalAll();
			}finally {
				lock.unlock(); //release the lock
			}
		}
	}

}
