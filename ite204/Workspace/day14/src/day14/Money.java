package day14;

public class Money {
	
	private int dollars;
	private int cents;
	
	public Money(int d, int c){
		this.dollars = d;
		this.cents = c;
	}
	
	public Money(String m){
		
		int decimalpos = m.indexOf(".");
		
		if(m.charAt(0) == '$'){
			this.dollars = Integer.parseInt(m.substring(1, decimalpos));
		}else{
			this.dollars = Integer.parseInt(m.substring(0, decimalpos));
		}
		
		this.cents = Integer.parseInt(m.substring(decimalpos + 1, m.length()));
	}
	
	public Money(){
		this.dollars = 0;
		this.cents = 0;
	}
	
	public int getDollars(){
		return this.dollars;
	}
	
	public int getCents(){
		return this.cents;
	}
	
	public Money addMoney(Money m){
		Money total = new Money(this.dollars + m.getDollars(), this.cents + m.getCents());
		
		if(total.cents >= 100){
			total.dollars++;
			total.cents -= 100;
		}
		
		return total;
	}
	
	public Money subMoney(Money m){
		Money total = new Money(this.dollars - m.getDollars(), this.cents - m.getCents());
		
		if(total.cents < 0){	
			total.dollars--;
			total.cents += 100;
		}
		
		return total;
	}
	
	public Money multiply(int m){
		Money total = new Money(this.dollars * m, this.cents * m);
		
		while(total.cents >= 100){
			total.dollars++;
			total.cents -= 100;
		}
		
		return total;
		
	}
	
	public int compare(Money m){
		if(this.dollars > m.getDollars()){
			return 1;
		}else if(this.dollars < m.getDollars()){
			return -1;
		}else if(this.cents > m.getCents()){
			return 1;
		}else if(this.cents < m.getCents()){
			return -1;
		}else{
			return 0;
		}
	}
	
	public String toString(){
		if(this.cents < 10){
			return "$" + this.dollars + ".0" + this.cents;
		}else{
			return "$" + this.dollars + "." + this.cents;
		}
	}
}
