package animalPol;

public class Main {

	public static void main(String[] args) throws Exception {
		
		 Pet p = new Dog(); 
		
		 p.feed();
		 
		 if(p instanceof Dog d) { // the new way to automatic casting; 
		 d.sit();
		 }else {
			 System.out.println("error");
		 }
		
		
		

	}
	

	

}
