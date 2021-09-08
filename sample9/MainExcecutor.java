package sample9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainExcecutor {
	private static final String ARGUMENTS_ERROR_MESSAGE = "正しいファイルを指定してください";
	public static void main(String[] args) throws FileNotFoundException, IOException {
		if (args.length != 1 || !new File(args[0]).exists()) {
			System.out.println(ARGUMENTS_ERROR_MESSAGE);
			return;
		}
		System.out.println(new CSReader().readAll(args[0]));
	}

}
