
public class TradeOrder {

	private Trader trader;
	private int numShares;
	private double price;
	private String symbol;
	private boolean buy;
	private boolean market;
	
	TradeOrder(Trader t, String s, boolean buy,  boolean market, int shares, double price) {
		
		trader = t;
		symbol = s;
		this.buy = buy;
		this.market = market;
		this.price = price;
		numShares = shares;
	}
	
	public String toString() {
		
		String buyOrSell, marketOrLimit;
		if (buy) 
			buyOrSell = "buy";
		else
			buyOrSell = "sell";
		if (market)
			marketOrLimit = "market";
		else
			marketOrLimit = "limit";
		
		
		return trader + "\n" + symbol + "\n" + buyOrSell + "\n" + marketOrLimit ;
		
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public int getNumShares() {
		return numShares;
	}

	public void setNumShares(int numShares) {
		this.numShares = numShares;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public boolean isBuy() {
		return buy;
	}

	public void setBuy(boolean buy) {
		this.buy = buy;
	}

	public boolean isMarket() {
		return market;
	}

	public void setMarket(boolean market) {
		this.market = market;
	}
	
	public void subtractShares (int shares) {
		numShares -= shares;
	}
	
	
}
