package bank;

public abstract class Account {
	
	protected double balance = 0.0;
	protected double percentage;
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public abstract double updateBalance(double percentage);

	

}
