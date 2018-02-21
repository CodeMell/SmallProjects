
public abstract class House {

	private int length;
	private int width;
	private int numfloors;
	
	public House( int l, int w, int n ) {
		
		this.length = l;
		this.width = w;
		this.numfloors = n;
	}
	
	public House() {
		
		this( 140, 100, 2 );
	}
	
	public int getLength() {
		
		return this.length;
	}
	
	public int getWidth() {
		
		return this.width;
	}
	
	public int getNumFloors() {
		
		return this.numfloors;
	}
	
	public int findArea() {
		
		return this.length * this.width * this.numfloors;
	}
	
	public abstract Money computeFee();
	
	// toString() coming soon to a java program near you
	public String toString() {
		
		String msg = "Information about the ";
		if( this instanceof Rental ) {
			
			msg += "rented";
		}
		else {
			
			msg += "owned";
		}
		
		msg += " house\n";
		
		msg += "Length: " + this.length;
		msg += "\nWidth: " + this.width;
		msg += "\nNumber of floors: " + this.numfloors;
		
		if( this instanceof Rental ) {
			
			msg += "\nUtilities: " + ((Rental)this).getUtilities();
			msg += "\nCost per foot: " + ((Rental)this).getCostPerFoot();
		}
		else {
			
			msg += "\nTax Amount: " + ((Owned)this).getTaxAmt();
		}
		
		msg += "Hours fee is " + this.computeFee();
		
		return msg;		
	}
}






