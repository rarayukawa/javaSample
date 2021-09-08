package sample9;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class WriteFile1 {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("使用法\n例");
			return;
		}
		String filename = args[0];
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)))) {
			String line;
			while ((line = reader.readLine()) != null) {
				writer.println(line);
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
