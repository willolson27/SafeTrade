
public class Trader {

	private Brokerage brokerage;
	private String username;
	private String password;
	
	
	public Trader (Brokerage brok, String user, String pass ) {
	
		brokerage = brok;
		username = user;
		password = pass;
		
	}
	
	public String toString() {
		
		return brokerage + username;
		
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
}
