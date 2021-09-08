package sample9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindFile1 {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("使用法\n例");
		}
		try(BufferedReader reader = new BufferedReader(new FileReader(args[1]))) {
			String line;
			int linenum = 1;
			while ((line = reader.readLine()) != null) {
				int n = line.indexOf(args[0]);
				if (n >= 0) {
					System.out.println(linenum + ":" + line);
				}
				linenum++;
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
