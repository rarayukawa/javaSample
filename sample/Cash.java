package sample;

public class Cash implements Cashier {
	@Override
	public void bill() {
		System.out.println("現金でお会計します");
	}
}
