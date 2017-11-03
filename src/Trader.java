
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

	public int compareTo(Trader other) {

		return this.username.compareTo(other.username);
		
	}
	
	public boolean equals (Trader other) {
		if (this.username.toLowerCase().equals(other.username.toLowerCase()))
			return true;
		return false;
	}
	
	public String getName() {
		
		return username;
		
	}
	
	public String getPassword() {
		
		return password;
		
	}
	
	public void placeOrder (TradeOrder order) {
		
		brokerage.placeOrder(order);
		
	}
	
	
	public void quit () {
		
		brokerage.logout(this);
	}

	public void getQuote(String symbol) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
