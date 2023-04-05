package rectangle;

public class Rectangle {
	final private int l1;
	final private int l2;
	
	public Rectangle(int l1, int l2) {
		super();
		this.l1 = l1;
		this.l2 = l2;
	}
	
	public Rectangle(int l1) {
		super();
		
		this.l1 = l1;
		this.l2 = 0;
	}
	
	
	public int square() {
		int square = this.l1 * this.l2;
		
		return square;
	}
	
	
	
	
	

}
