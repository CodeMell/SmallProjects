package day06;

public class Triangle {
	double base;
	double height;
	
	public Triangle( double b, double h){
		
		this.base = b;
		this.height = h;
		
	}
	
	public Triangle(){
		
		this.base = 2.0;
		this.height = 1.0;
		
	}
	
	public double findArea(){
		
		return .5 * this.base * this.height;
		
	}
	
	public String toString(){
		
		return "Triangle with a base of " + this.base + " and a height of " + this.height + " has a an area of " + this.findArea();
	}
}
