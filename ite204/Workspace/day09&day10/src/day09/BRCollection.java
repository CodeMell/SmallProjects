package day09;

public class BRCollection {
	
	private Bluray[] collection;
	private int count;
	private Money totalCost;
	
	public BRCollection(int size){
		
		this.collection = new Bluray[size];
		this.count = 0;
		this.totalCost = new Money();
	}
	
	public BRCollection(){
		this(20);
	}
	
	public int getCount(){
		return this.count;
	}
	
	public Money getCost(){
		return this.totalCost;
	}
	
	public void addBR( Bluray br){
		
		this.collection[this.count] = br;
		this.count++;
		this.totalCost = this.totalCost.addMoney(br.getCost());
	}
	
	public String toString(){
		
		String msg = "Details about my collection\n\nNumber of Blurays is: " + this.count + "\n\nTotal Cost is: " + totalCost + "\n\n";
		
		for(int i = 0; i < this.count; i++){
			msg += this.collection[i] + "\n\n";
		}
		
		return msg;
	}
}
