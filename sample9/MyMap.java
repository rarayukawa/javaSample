package sample9;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("0", "zaro");
		map.put("1", "one");
		map.put("2", "two");
		
		System.out.println(map.get("0"));
	}
}
