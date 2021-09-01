package sample;

import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		ArrayTest<String> names = new ArrayTest<>();
		names.add("湊");
		names.add("明日香");
		names.add("鹿原");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
	}
}
