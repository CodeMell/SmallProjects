
public class MasterCrook extends CreditCard{
	
	private Money serviceFee;
	
	public MasterCrook(String idnum, Money servicefee){
		super(idnum);
		this.serviceFee = servicefee;
	}
	
	public MasterCrook(){
		this.serviceFee = new Money("$5.00");
	}
	
	public Money getServiceFee(){
		return this.serviceFee;
	}
	
	public void chargeCard(Money chargeamt){
		this.setBalance(this.getBalance().addMoney(chargeamt.addMoney(this.serviceFee)));
	}
}
