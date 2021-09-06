package sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Listsample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(1);
		list.add("a");
		list2.add(2);
		
		Iterator<Integer> iterator = list2.iterator();
		while(iterator.hasNext()) {
			int num = iterator.next();
			System.out.println(num);
		}
	}
}
