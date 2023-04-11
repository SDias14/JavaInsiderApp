package geometry;

public class Rectangle implements Shape{
	
private double num1;
private double num2;
	
	
	
	
	public Rectangle(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	@Override
	public double surfaceArea() {
		
		double numOne = num1;
		double numTwo = num2;
		 
		
		double total = numOne * numTwo;
		
		return total;
		
	}
}
