package hw5stock;

public class Hw5driver {
	
	public static void main(String[] args){
		
		Stock stock1 = new Stock();
		Stock stock2 = new Stock("FCOJ", 27.0, 43.0);
		Stock stock3 = new Stock("FLGY", 50.0, 60.0);
		
		System.out.println(stock1);
		System.out.println(stock2);
		System.out.println(stock3);
		
		if(stock1.getPercentChange() > stock2.getPercentChange() && stock1.getPercentChange() > stock3.getPercentChange()){
			
			System.out.println(stock1.name + " has the highest percent change");
			
		}else if(stock2.getPercentChange() > stock1.getPercentChange() && stock2.getPercentChange() > stock3.getPercentChange()){
			
			System.out.println(stock2.name + " has the highest percent change");
			
		}else if(stock3.getPercentChange() > stock1.getPercentChange() && stock3.getPercentChange() > stock2.getPercentChange()){
			
			System.out.println("\n" + stock3.name + " has the highest percent change");
			
		}
		
	}
}
