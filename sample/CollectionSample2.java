package sample;
import java.util.HashMap;
import java.util.Map;
public class CollectionSample2 {
	private String name;
	public CollectionSample2(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public static void main(String[] args) {
		Map<String, Integer> o = new HashMap<String, Integer>();
		CollectionSample2 h1 = new CollectionSample2("斉藤");
		CollectionSample2 h2 = new CollectionSample2("伊藤");
		o.put(h1.getName(), 3);
		o.put(h2.getName(), 7);
		for (String n : o.keySet()) {
			int value = o.get(n);
			System.out.println(n + "が倒した敵= " + value);
		}
		
	}
}
