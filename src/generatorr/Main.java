package generatorr;

public class Main {

	public static void main(String[] args) {
		
		Generator generator = new SequenceGenerator();
		
		Person p1 = new Person(generator); 
		
		System.out.println(p1.getId());
		

		
		Person p2 = new Person(generator); 
		
		System.out.println(p2.getId());
		
		


	}

}
