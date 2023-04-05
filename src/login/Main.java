package login;

public class Main {

	public static void main(String[] args) {
		
		User u1 = new User();
		
		u1.setUser("Carlos");
		u1.setPass("1234");
		
		
	System.out.println(u1.login("Carlos","1234"));
	
	System.out.println(u1.login2("Admin", "admin"));

	}

}
