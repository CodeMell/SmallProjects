package day06;

public class TestBankAccount {

	public static void main(String[] args) {
		
		BankAccount ajacct = new BankAccount("19235", 200.00);
		BankAccount codyacct = new BankAccount("65493", 52.00);
		
		System.out.println(codyacct);
		
		System.out.println(ajacct);
		
		codyacct.deposit(100.0);
		
		System.out.println(codyacct);
		
		if(ajacct.withdraw(50.0)){
			System.out.println("Withdrawal was a success!!");
		}else{
			System.out.println("Sorry, insufficent funds.");
		}
		
		System.out.println(ajacct);
	}

}
