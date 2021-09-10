package sample9;

import java.util.HashMap;

public class MashSample {
	public static void main(String[] args) {
		HashMap<String, Integer> kamoku = new HashMap<>();
		kamoku.put("国語", 90);
		kamoku.put("数学", 80);
		kamoku.put("英語", 70);
		
		for (String name : kamoku.keySet()) {
			System.out.println(name + ":" + kamoku.get(name));
		}
	}
}
