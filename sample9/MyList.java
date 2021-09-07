package sample9;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	public static void main(String... args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		for (String s : list) {
			System.out.println(s);
		}
		
		//要素に数値ラッパー型を指定
		List<Integer> list1 = new ArrayList<>();
		
		//要素が配列（参照型）でもOK
		List<int[]> list2 = new ArrayList<>();
		//コレクション型（参照型）もOK
		List<List<String>> list3 = new ArrayList<>();
	}
}
