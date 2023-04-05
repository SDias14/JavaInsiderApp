package exercioP;

public class SavingAccount extends Account{
	
	private double rate;
	
	
	public SavingAccount(String number, double rate) {
		super(number); // this is the Default Constructor. In every situation when we need to 
		// construct an object the Main class constructor is called. Super is always the first thing to be called on.
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	@Override  // showing that this method is overriding the main one. 
	public void setBalance(double balance){
		this.balance = balance * rate;
		
		
	}
	
	@Override // override is optional. but it's important because we know that there is an override process.
	//the override method works only if the method has the same signature. It's always recommended to use override
	public void print() {
		super.print();
		
		System.out.println("Rate: " + rate);
	}
	
	
	}
