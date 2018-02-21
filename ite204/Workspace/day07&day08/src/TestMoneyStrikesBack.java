
public class TestMoneyStrikesBack {
	public static void main(String[] args){
		
		Money userCash = new Money(10000, 00);
		
		Money xbone = new Money(399,99);
		Money ps4 = new Money(299,99);
		
		if(userCash.compare(xbone.addMoney(ps4)) >= 0){
			System.out.println("You have enough money!!");
		}else{
			System.out.println("Get a Job!!");
		}
	}
}
