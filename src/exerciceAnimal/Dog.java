package exerciceAnimal;

public class Dog extends Animal implements Walkable, Jumpable{
	
	public Dog() {
		super();
	}
	
	@Override
	public String walk() {
		return "I'm Walking with my dear owner";
	}
	
	@Override
	public String stop() {
		return "I'm stopping";
	}

	public String talk() {
		return "AUAU";
	}
	
	@Override
	public String jump() {
		return "puts putz";
	}
	
	
	@Override
	public void sleep(int time) {
		System.out.println("Dog sleeps for : " + time + " Hours" );
	}

}
