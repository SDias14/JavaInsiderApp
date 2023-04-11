package geometryEx;

public class Calculator {
	
	private double total;
	
	public double sumSurfaceArea(Shape s) {
		total += s.surfaceArea();
		return total;
	}

}
