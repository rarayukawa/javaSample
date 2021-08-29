package sample;

public class Staff {
	public static void main(String[] args) {
		Cashier cash = new Cash();
		Cashier credit = new CreditCard();
		
		System.out.println("****現金対応****");
		cash.bill();
		
		System.out.println("****クレジット対応****");
		credit.bill();
	}
	
	
}
