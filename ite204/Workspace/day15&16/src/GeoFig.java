
public abstract class GeoFig {
	
	private String color;
	
	public GeoFig(String color){
		this.color = color;
	}
	
	public GeoFig(){
		this("plaid");
	}
	
	public String getColor(){
		return this.color;
	}
	
	public abstract double findArea();
	
	public abstract double findPerim();
	
	public String toString(){
		String msg = "\nDetails about your ";
		
		if(this instanceof Cylinder){
			msg += "cylinder";
		}else if(this instanceof Circle){
			msg += "circle";
		}else{
			msg += "rectangle";
		}
		
		msg += "\nColor: " + this.getColor();
		msg += "\nArea: " + this.findArea();
		if(this instanceof Cylinder){
			msg += "\nVolume: " + ((Cylinder)this).findVolume();
		}
		
		return msg;
	}
	
}
