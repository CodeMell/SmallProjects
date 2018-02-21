
public class Owned extends House {

	private Money taxamt;
	
	public Owned( int l, int w, int n, Money t ) {
		
		super( l, w, n );
		this.taxamt = t;
	}
	
	public Owned() {
		
		this( 80, 90, 2, new Money() );
	}
	
	public Money getTaxAmt() {
		
		return this.taxamt;
	}
	
	public Money computeFee() {
		
		return new Money( "$10000.00" ).multiplyMoney( this.findArea() ).addMoney( this.taxamt );
	}
	
}
