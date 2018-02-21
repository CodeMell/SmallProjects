package day09;

public class TestBRCollection {

	public static void main(String[] args) {
		
		BRCollection col1 = new BRCollection();
		col1.addBR(new Bluray("LOTR", "Fantasty", new Money("$100.01")));
		col1.addBR(new Bluray("Avatar", "SciFi", new Money("10.10")));
		col1.addBR(new Bluray("Jaws", "Thriller", new Money("15.22")));
		
		System.out.println(col1);
	}

}
