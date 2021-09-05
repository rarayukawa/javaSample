package sample;

import java.util.ArrayList;

public class CollectionSample {
	private String name;
	public CollectionSample(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public static void main(String[] args) {
		ArrayList<String> namelis = new ArrayList<String>();
		
		CollectionSample c1 = new CollectionSample("湯川");
		CollectionSample c2 = new CollectionSample("rara");
		namelis.add(c1.getName());
		namelis.add(c2.getName());
		for(String n : namelis) {
			System.out.println(n);
		}
	}
}
