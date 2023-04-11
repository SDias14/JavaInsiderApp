package bank;

public class Main {

	public static void main(String[] args) {
		
		CheckingAccount c1 = new CheckingAccount(1000);
		
		double percent = c1.updateBalance(0.3);
		
		System.out.println("The initial Balance was : " + c1.getBalance() + ". The new one is : " + percent );
		
		
		System.out.println("/////////////////////////////////");
		
		SavingsAccount c2 = new SavingsAccount(3000);
		
		double percent2 = c2.updateBalance(0.5);
		
		System.out.println("The initial Balance was : " + c2.getBalance() + ". The new one is : " + percent2 );

	}

}
