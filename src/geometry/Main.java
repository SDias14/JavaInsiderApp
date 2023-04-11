package geometry;

public class Main {

	public static void main(String[] args) {
		
		
		
		     Shape shape = new Circle(Math.round(Math.PI), 5);
		     
		    
		     
		     
		     
		     Calculator calculator = new Calculator(shape);
		     
		     double result1 = shape.surfaceArea();
		     
		     System.out.println("Area do circulo :" + result1);
		     
		     
		     
		     double area = calculator.totalArea();
		     
		     
		     
		     System.out.println("////////////////////////////");
		     
          
			 Shape shape2 = new Square(7);
             
             double result2 = shape2.surfaceArea();
             
             System.out.println("Area do quadrado é :" + result2);
		     
		    
		     double area2 = calculator.totalArea();
		     
		     
		     
		     System.out.println("////////////////////////////");
		     
		     
		     Shape shape3 = new Rectangle(10.0, 5.0);
		     
             double result3 = shape3.surfaceArea();
             
             System.out.println("Area do Retangulo é :" + result3);
		     
		    
		     double area3 = calculator.totalArea();
		     
		     System.out.println("total area acumulada : " + area3);
		     
		     
		     
		
		     
		     
		    
		     
		     
		    
		     
		     
		     
		     
		     
		     
		     
		   
		     
		     
	
	
	}
	
	
	
}