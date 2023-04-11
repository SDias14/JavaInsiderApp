package geometry;

public class Circle implements Shape{
	
	private double num1;
	private double num2;
	
	
	
	public Circle(double num1, double num2) {
       this.num1 = num1;
       this.num2 = num2;
		
	}
	
	@Override
	public double surfaceArea() {
		
		double Pi = num1;
		double side = num2; 
		
		double total = Pi * (side * side);
		
		return total;
		
		
		
}
	
	

}
