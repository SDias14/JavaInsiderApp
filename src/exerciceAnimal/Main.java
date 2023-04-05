package exerciceAnimal;

public class Main {

	public static void main(String[] args) {
		
		Dog sheperd = new Dog();
		
		sheperd.setColor("black");
		
		System.out.println(sheperd.getColor());
		
		System.out.println(sheperd.walk());
		System.out.println(sheperd.stop());
		System.out.println(sheperd.talk());
		System.out.println(sheperd.jump());
		
		Cat dumpener = new Cat();
		
		dumpener.setColor("White");
		
		System.out.println(dumpener.getColor());
		
		System.out.println(dumpener.walk());
		System.out.println(dumpener.stop());
		System.out.println(dumpener.talk());
		System.out.println(dumpener.jump());
		
		
		Fish clown = new Fish();
		
		clown.setColor("red");
		
		System.out.println(clown.getColor());
		
		System.out.println(clown.swim());
		
		
		Ant ant1 = new Ant(); 
		
		System.out.println(ant1.walk());
		System.out.println(ant1.stop());
		

	}

}
