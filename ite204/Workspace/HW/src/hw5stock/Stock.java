package hw5stock;

public class Stock {
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	public Stock(){
		this.name = "GOOG";
		this.previousClosingPrice = 100.0;
		currentPrice = 101.0;
	}
	
	public Stock(String n, double prev, double cur){
		this.name = n;
		this.previousClosingPrice = prev;
		this.currentPrice = cur;
	}
	
	public String getName(){
		return this.name;
	}
	
	public double getPrevPrice(){
		return this.previousClosingPrice;
	}
	
	public double getCurPrice(){
		return this.currentPrice;
	}
	
	public double getPercentChange(){
		return ((this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice) * 100;
	}
	
	public String toString(){
		return this.name + ":\nPrevious closing price: " + this.previousClosingPrice + "\n" + "Current price: " + this.currentPrice + "\nPercent change: " + this.getPercentChange() + "%\n";
	}
}
