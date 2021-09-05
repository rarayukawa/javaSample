package sample;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都", 255);
		prefs.put("東京", 1261);
		prefs.put("熊本", 181);
		prefs.put("三重", 11);
		prefs.put("和歌山", 121);
		prefs.put("大分", 341);
		prefs.put("埼玉", 1321);
		int tokyo = prefs.get("東京");
		System.out.println("東京の人口は" + tokyo);
		prefs.put("熊本", 182);
		int kumamoto = prefs.get("熊本");
		System.out.println("熊本の人口は" + kumamoto);
		for(String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + "の人口は" + value);
		}
	}
}
