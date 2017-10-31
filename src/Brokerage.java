import java.util.TreeMap;
import java.util.TreeSet;

public class Brokerage implements Login{

	
	private TreeMap<String, Trader> registeredTraders;
	private TreeSet<Trader> loggedInTraders;
	
	
	public Brokerage () {
		registeredTraders = new TreeMap<String, Trader>();
		loggedInTraders = new TreeSet<Trader>();
	}


	public Brokerage(StockExchange exchange) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public int addUser(String name, String password) {
		
		int len = name.length();
		if (len < 4 || len > 10)
			return -1;
		len = password.length();
		if (len < 2 || len > 10)
			return -2;
		if (registeredTraders.containsKey(name)) 
			return -3;
		registeredTraders.put(name, new Trader(this, name, password));
		return 0;
	}


	@Override
	public int login(String name, String password) {
		Trader trader = registeredTraders.get(name);
		if (trader == null) 
			return -1;
		String storedPassword = trader.getPassword();
		if (storedPassword != password)
			return -2;
		
		return 0;
		
	}
	
	public void getQuote(String symbol, Trader trader) {
		
	}
	
	public void placeOrder (TradeOrder order) {
		
		
	}
	
}
