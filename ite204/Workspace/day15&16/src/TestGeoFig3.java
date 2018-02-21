
public class TestGeoFig3 {

	public static void main(String[] args) {
		
		GeoFig rec1 = new Rectangle("Blue", 5.6, 3.4);
		GeoFig circ1 = new Circle("Orange", 7.8);
		GeoFig cyl1 = new Cylinder("Silver", 3.9, 15.8);
		
		System.out.println("Area of cyl1 is " + cyl1.findArea());
		System.out.println("Volume of cyl1 is " + ((Cylinder)cyl1).findVolume());
		System.out.println(cyl1);

	}

}
