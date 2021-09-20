package sample9;

public class sampleString {
	public static void main(String[] args) {
		String text = "abc123";
		System.out.println(text.matches("[a-z0-9]+"));
		System.out.println(text.matches("[a-z]+"));
		
		System.out.println(text.replaceAll("[a-z]", "*"));
		String text2 = "23湯川";
		if (text2.matches("[0-9]+")) {
			System.out.println(text.substring(0, 1));
		}
		System.out.println();
	}
}
