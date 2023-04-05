package exercicioNumber;

public class Number {
	
private static int instances = 0;
	
	private int number;

	private Number(int number) {
		super();
		this.number = number;
		instances++;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public static int instances() {
		return instances;
	}
	
	public static Number newNumber(int n) {
		return new Number(n);
	}
	
	public static Number add(Number n1, Number n2) {
		return new Number(n1.getNumber() + n2.getNumber());
	}
	

}


/*
 * 
 * 
 * 
 * 
 * 	private static int instances = 0;
	
	private int number;

	public Number(int number) {
		super();
		this.number = number;
		instances++;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public static int instances() {
		return instances;
	}
	
	public static Number add(Number n1, Number n2) {
		return new Number(n1.getNumber() + n2.getNumber());
	}
	
	*/
