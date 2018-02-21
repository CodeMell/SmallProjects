
public class Circle extends GeoFig{
	
	private double radius;
	
	public Circle( String color, double radius){
		super(color);
		this.radius = radius;
	}
	
	public Circle(){
		super();
		this.radius = 1.0;
	}
	
	public double findArea(){
		return Math.PI * (this.radius * this.radius);
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public double findPerim(){
		return 2 * Math.PI * this.radius;
	}
	
	
}
