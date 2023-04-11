package exerciceAnimal;

//we are not allowed to instantiate this class because is abstract
public abstract class Animal {	
	
	private String color;
	private int amountEaten;
	
	
	public Animal(){
		super();
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public int getAmountEaten() {
		return amountEaten;
	}

	public void setAmountEaten(int amountEaten) {
		this.amountEaten = amountEaten;
	}

	public void feed(int amount) {
		amountEaten += amount;

}
	public abstract void sleep(int time);  // when i need a method to be implemented just in inherited classes
	// i can use abstract methods. It's mandatory for all subclasses the implementation 
	
	
}
