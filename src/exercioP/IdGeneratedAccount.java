package exercioP;

public class IdGeneratedAccount {
	private static final int INITIAL_VALUE = 1; // all constants are defined by upper case Letters. Many developers 
	//create a new class designed to store constant values.
	
	private final String accountNumber;
	private final String accountOwner;
	private double balance;
	private static int currentId;
	
	
	
	static {
		//initializing currentId. It's called once in a class
		currentId = INITIAL_VALUE;
	}
	
	
	public IdGeneratedAccount( String accountOwner) {
		this.accountNumber = "000" + currentId++;
		this.accountOwner = accountOwner;
		this.balance = 0.0;
	}
	
	boolean deposit(double amount) {
		if(amount > 0 ) {
			balance += amount;
			return true;
		}
		return true;
	}
	
	boolean withdraw(double amount) {
		if(amount > 0) {
			balance -= amount;
			return true;
		}
		return false;
	}
	
	void transfer(double amount, IdGeneratedAccount targetAccount) {
		withdraw(amount);
		targetAccount.deposit(amount);
	}
	
	void printBalance() {
		System.out.println("Balance: R$ " + balance);
	}
	
	
	public static int getCurrentId() {
		return currentId;
	}
	
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountOwner() {
		return accountOwner;
	}
	
	public double getBalance() {
		return balance;
	}
	

}
