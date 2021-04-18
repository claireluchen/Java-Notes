package Lesson;

public class JointBankAccountSync implements Runnable{
	private BankAccount2 jointAccount = new BankAccount2();
	
	public static void main(String[] args) {
		JointBankAccountSync theAccount = new JointBankAccountSync();
		Thread one = new Thread(theAccount, "Jack");
		Thread two = new Thread(theAccount, "Jill");
		System.out.println(one.getPriority());
		System.out.println(two.getPriority());
		one.start();
		two.start();		
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			makeWithdrawal(20); //withdraw 20 dollars
			if (jointAccount.getBalance() < 0) { //shouldn't happen since makeWithdrawal shouldn't allow the balance to reach negative
				System.out.println("Account Overdrawn");
			}
		}
		
	}
	
	//each transaction needs to be fully completed before another thread can be called
	private synchronized void makeWithdrawal(int amount) { //adds lock
		if (jointAccount.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw");
			try {
				System.out.println(Thread.currentThread().getName() + " is going to sleep");
				Thread.sleep(500);
			}catch(InterruptedException s) {
				System.out.println(s);
			}
			System.out.println(Thread.currentThread().getName() + " woke up");
			jointAccount.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " completed the withdrawl");
		}else {
			System.out.println("Not enough bucks for " + Thread.currentThread().getName());
		}
		
	}

}

class BankAccount2{
	private int balance = 100;
	
	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount) {
		balance -= amount;
		
	}
}

