package day09;


public class BankAccountNew {
	
	private String acctnum;
	private Money balance;
	
	public BankAccountNew(String a, Money b){
		
		this.acctnum = a;
		this.balance = b;	
	}
	
	public BankAccountNew(){
		
		this.acctnum = "000000";
		this.balance = new Money();
	}
	
	public String getAcctnum(){
		
		return this.acctnum;
	}
	
	public Money getBalance(){
		
		return this.balance;
	}
	
	public void deposit(Money depamt){
		
		this.balance = this.balance.addMoney(depamt);
	}
	
	public boolean withdraw(Money wdamt){
		
		if(this.balance.compare(wdamt) >= 0){
			this.balance = this.balance.subMoney(wdamt);
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		
		return "Acct " + this.acctnum + " has a balance of " + this.balance;
	}
}
