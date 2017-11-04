package testQuest;

public class BankAccount {
	
	private double balance; //3.
	public synchronized void deposit(double amount) {
		balance += amount;
	} //7.
	public void withdraw(double amount) {
		synchronized(this) {
			balance -= amount;
		}
	} //13.
	public double getBalance() {
		return balance;
	}
}
