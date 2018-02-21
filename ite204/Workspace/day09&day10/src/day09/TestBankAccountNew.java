
public class TestBankAccountNew {

	public static void main(String[] args){
		
		BankAccountNew acct1 = new BankAccountNew("192834", new Money( 100, 00));
		
		System.out.println(acct1);
		
		acct1.deposit(new Money(1000, 02));
		System.out.println(acct1);
		
		if(acct1.withdraw(new Money(1, 00)) == true){
			
			System.out.println("After withdrawal " + acct1);
		}else{
			
			System.out.println("Sorry, Insufficent funds");
		}
	}
}
