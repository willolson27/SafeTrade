import java.util.HashMap;

public class StockExchange {

	private HashMap <String, Stock> stocks;
	private String doesNotExist = "This stock does not exist";
	
	
	public StockExchange() {
		stocks = new HashMap <String, Stock>();
	}
	
	String getQuote(String symbol) {
		if (stocks.containsKey(symbol))
			return stocks.get(symbol).toString();

		else
			return doesNotExist;
	}
	
	void listStock (String symbol, String name, double price) {
		Stock newStock = new Stock(symbol, name, price);
		stocks.put(symbol, newStock);
	}
	
	void placeOrder (TradeOrder order) {
		String sym = order.getSymbol();
		if (stocks.containsKey(sym))
			stocks.get(sym).placeOrder(order);
	}
	
}
