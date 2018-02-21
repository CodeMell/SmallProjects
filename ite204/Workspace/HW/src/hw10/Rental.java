
public class Rental extends House {

	private Money costperfoot;
	private Money utilities;
	
	public Rental( int l, int w, int n, Money c, Money u ) {
		
		super( l, w, n );
		this.costperfoot = c;
		this.utilities = u;
	}
	
	public Rental() {
		
		this( 140, 100, 2, new Money(), new Money() );
	}
	
	public Money getCostPerFoot() {
		
		return this.costperfoot;
	}
	
	public Money getUtilities() {
		
		return this.utilities;
	}
	
	// override the computeFee() method
	public Money computeFee() {
		
		return this.costperfoot.multiplyMoney( this.findArea() ).addMoney( this.utilities );
	}
}






