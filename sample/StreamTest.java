package sample;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StreamTest {
	public static void main(String[] args) throws IOException {
		try(BufferedReader reader = new BufferedReader(new FileReader("data.txt"))){
			int input = reader.read();
			while (input != -1) {
				System.out.print((char)input);
				input = reader.read();
			}
		}
	}
}
