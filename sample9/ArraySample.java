package sample9;

import java.util.ArrayList;

public class ArraySample {
	public static void main(String[] args) {
		String[] array1 = {"りんご", "みかん", "バナナ", "ぶどう"};
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		ArrayList<String> array2 = new ArrayList<>();
		array2.add("りんご");
		array2.add("みかん");
		array2.add("バナナ");
		array2.add("ぶどう");
		for(String s : array2) {
			System.out.println(s);
		}
	}
}
