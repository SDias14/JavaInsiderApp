package exercices;

public class Lamp {
	
	private String on;

	public Lamp(String on) {
		super();
		this.on = on;
	}
	
	public void turnOn() {
		if(this.on == "l") {
			this.on = "ligada";
		}
	}
	
	public void turnOff() {
		if(this.on == "d") {
			this.on = "desligada";
		}
	}
	
	
	public void showState() {
		if(this.on == "ligada") {
			System.out.println("Lâmpada Ligada");
		}else if(this.on == "desligada"){
			System.out.println("Lâmpada Desligada");
		}
	}
	
	
	
	
	
	

}
