package geometry;

public class Square implements Shape{
	
	
	private double num1;
	
	
	
	
	public Square(double num1) {
		this.num1 = num1;
		
	}
	
	@Override
	public double surfaceArea() {
		
		double l1 = num1;
		 
		
		double total = l1 * l1;
		
		return total;
		
		
		
}

}
