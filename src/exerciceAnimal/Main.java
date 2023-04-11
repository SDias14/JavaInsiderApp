package exerciceAnimal;

public class Main {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		
		d1.feed(10);
		d1.feed(5);
		d1.sleep(10);
		
		System.out.println(d1.getAmountEaten());
		
		Cat c1 = new Cat();
		
		
		c1.feed(10);
		c1.feed(12);
		c1.sleep(14);
		
		Animal a3 = new Cat(); // this is a kind of polymorphism animal.We are creating a variable of Animal type
		// and this variable makes reference to the object Cat.  
		
		a3.setColor("Green");
		System.out.println(a3.getColor());
		
		
		System.out.println(c1.getAmountEaten());
		
		
	
		
		

	}

}



/*

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
*/
