
public class TestGeoFig2 {

	public static void main(String[] args) {
		
		GeoFig c1 = new Circle("red", 6.5);
		GeoFig r1 = new Rectangle("purple", 2.3, 4.5);
		GeoFig c2 = new Circle("green", 12.3);

		GeoFig maxfig = findMaxArea(c1, r1);
		maxfig = findMaxArea(maxfig, c2);
	}
	
	public static GeoFig findMaxArea(GeoFig fig1, GeoFig fig2){
		if(fig1.findArea() > fig2.findArea()){
			return fig1;
		}else{
			return fig2;
		}
	}
}
