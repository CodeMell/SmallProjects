package day05;

public class Circle {
	
	double radius;
	String color;
	
	public Circle(double r, String c){
		
		radius = r;
		color = c;
		
	}
	
	public double findArea(){
		
		return Math.PI * Math.pow(radius, 2);
		
	}
	
	public double findCir(){
		
		return 2 * Math.PI * radius;
		
	}
}
