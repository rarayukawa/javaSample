package sample;

public class Item {
	String name;
	int price;
	public Item(String name) {
		this.name = name;
		this.price = 0;
	}
	
	public Item(String name, int price) {
		this(name);
		this.price = price;
	}
}
