package day09;


public class Bluray {
	
	private String title;
	private String genre;
	private Money cost;
	
	public Bluray(String title, String genre, Money cost){
		
		this.title = title;
		this.genre = genre;
		this.cost = cost;
	}
	
	public Bluray(){
		
		this.title = "unknown";
		this.genre = "unknown";
		this.cost = new Money();
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public String getGenre(){
		return this.genre;
	}
	
	public Money getCost(){
		return this.cost;
	}
	
	public String toString(){
		
		return "****************************\n" +
				"Title: " + this.title + "\n" +
				"Genre: " + this.genre + "\n" +
				"Cost: " + this.cost + "\n" +
				"****************************";
	}
}
