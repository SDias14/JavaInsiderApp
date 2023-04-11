package geometry;

public class Calculator {
	
	private double area;
	private double total = 0;
	
	
	
	

    public Calculator(Shape s){
		this.area += s.surfaceArea();
		
		
		
	}
    
    
    public double totalArea() {
    	
    	return this.total = this.total + area ; 
    	
    	
    	
	}

	
	
	
	


}
