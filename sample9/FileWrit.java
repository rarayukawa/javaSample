package sample9;
import java.io.FileReader;
import java.io.IOException;
public class FileWrit {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("data.txt");
		int input = fr.read();
		while (input != -1) {
			System.out.print((char)input);
			input = fr.read();
		}
		fr.close();
	}
}
