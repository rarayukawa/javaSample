package sample;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSample {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");
		System .out .println("色は" + colors.size() + "種類");
		for(String s : colors) {
			System.out.print(s + "⇨");
		}
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for (String m : words) {
			System.out.print(m + "⇨");
		}
	}
}
