package sample;

import java.io.IOException;

public class Excep {
	public static void main(String[] args) throws IOException {
		throw new IOException("強制終了");
		String s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました\n--スタックトレース（ここから）--");
			e.printStackTrace();
			System.out.println("--スタックトレース（ここまで）--");
			
			int i = Integer.parseInt("三");
		}
	}
}
