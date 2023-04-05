package exerciceAnimal;

public class Ant implements Walkable{
	
	@Override
	public String walk() {
		return "I'm literally walking on the clouds";
	}
	
	@Override
	public String stop() {
		return "Now i'm falling";
	}

}
