
public class TestGeoFig {

	public static void main(String[] args) {
		GeoFig c1 = new Circle("red", 6.5);
		GeoFig r1 = new Rectangle("purple", 2.3, 4.5);
		GeoFig c2 = new Circle("green", 12.3);
		
		System.out.println("Color of c1 is " + c1.getColor());
		System.out.println("Area of c1 is " + c1.findArea());
		
		printinfo(c1);
		printinfo(r1);
		printinfo(c2);
	}
	
	public static void printinfo( GeoFig dafig){
		System.out.println("Color of the figure is " + dafig.getColor());
		System.out.println("Perimeter of the figure is " + dafig.findPerim());
	}

}
