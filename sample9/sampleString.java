package sample9;

public class sampleString {
	public static void main(String[] args) {
		String text = "abc123";
		System.out.println(text.matches("[a-z0-9]+"));
		System.out.println(text.matches("[a-z]+"));
		
		System.out.println(text.replaceAll("[a-z]", "*"));
	}
}
