package bank;

public class SavingsAccount extends Account{
	
	public SavingsAccount(double balance) {
		super(balance);
		
	}
	
	@Override
	public double updateBalance(double percentage) {
		double  percentages = balance * percentage;
		double finalValue = percentages + balance;
	    return finalValue ;		
	}


}
