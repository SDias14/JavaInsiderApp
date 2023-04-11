package bank;

public class CheckingAccount extends Account{
	
	

	public CheckingAccount(double balance) {
		super(balance);
		
	}
	
	@Override
	public double updateBalance(double percentage) {
		double  percentages = balance * percentage;
		double finalValue = percentages + balance;
	    return finalValue ;		
	}

}
