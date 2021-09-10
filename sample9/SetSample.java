package sample9;

import java.util.HashSet;

public class SetSample {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("りんご");
		set.add("みかん");
		set.add("バナナ");
		set.add("ぶどう");
		set.remove("みかん");
		System.out.println(set);
		
		if(set.contains("バナナ")) {
			System.out.println("true");
		} else {
			System.out.println("fals");
		}
		if(set.contains("みかん")) {
			System.out.println("true");
		} else {
			System.out.println("fals");
		}
	}
}
