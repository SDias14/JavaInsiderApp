package exerciceAnimal;

public class Cat extends Dog{
	
	public Cat() {
		super();
	}
	
	
	@Override 
	
	public String talk() {
		return "Miau";
	}
	
	@Override
	
	public String jump() {
		return "nene";
	}
	
	@Override
	public void sleep(int time) {
		System.out.println("Cat sleeps for : " + time + " Hours" );
	}
	
	

}
