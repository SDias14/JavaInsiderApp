package exerciceAnimal;

public class Fish extends Animal {
	
	public Fish() {
		super();
	}
	
	public String swim() {
		return "I'm swimming with my family";
	}
	
	@Override
	public void sleep(int time) {
		System.out.println("Fish sleeps for : " + time + " Hours"  );
	}


}
