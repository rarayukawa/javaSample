package sample9;
import java.io.FileWriter;
import java.io.IOException;
public class Fileread {

	
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("data.txt");
		fw.write('そ');
		fw.write('れ');
		fw.write('で');
		fw.write('は');
		fw.close();
	}
}
