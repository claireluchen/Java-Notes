package Lesson;

public class JointBankAccountNotSync implements Runnable{
	private BankAccount jointAccount = new BankAccount();
	
	public static void main(String[] args) {
		JointBankAccountNotSync theAccount = new JointBankAccountNotSync();
		Thread one = new Thread(theAccount, "Jack");
		Thread two = new Thread(theAccount, "Jill");
		one.start();
		two.start();		
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			makeWithdrawal(20); //withdraw 20 dollars
			if (jointAccount.getBalance() < 0) {
				System.out.println("Account Overdrawn");
			}
		}
		
	}
	
	private void makeWithdrawal(int amount) {
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

class BankAccount{
	private int balance = 100;
	
	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount) {
		balance -= amount;
		
	}
}
