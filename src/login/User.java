package login;

public class User implements Login, Login2{
	
	private String user;
	private String pass;
	private String usr = "Admin";
	private String passs = "admin";
	

	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public boolean login(String username, String password) {
	
		if(this.user == username && this.pass == password) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean login2(String u, String p) {
		if(this.usr == u && this.passs == p) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
		
		

}
