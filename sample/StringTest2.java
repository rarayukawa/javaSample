package sample;

public class StringTest2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000; i++) {
			sb.append("java");
		}
		String s = sb.toString();
		String s2 = "Java";
		System.out.println(s2.matches("Java"));
		System.out.println(s2.matches("JavaJava"));
		System.out.println(s2.matches("J.va"));
		String s3 = "Jaaaaaaava";
		System.out.println(s3.matches("Ja*va"));
		String s4 = "dsjfdhdf hoerhoefewクォをw";
		System.out.println(s4.matches(".*"));
		
		String s5 = "abc,def:ghi";
		String[] words = s5.split("[,:]");
		for(String w : words) {
			System.out.print(w + "->");
		}
		String w1 = s5.replaceAll("[beh]", "X");
		System.out.println(w1);
	}
	
	public boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7})");
	}
	
}
