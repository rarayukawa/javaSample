package sample9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Prime1 {
	private static final int MAX_PRIME = 1000;
	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.out.println("使用法\n例");
		}
		String filename = args[0];
		
		try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)))) {
			writePrime(writer);
		}
	}
	
	public static void writePrime(PrintWriter writer) {
		boolean[] prime = new boolean[MAX_PRIME];
		for (int n = 0; n < MAX_PRIME; n++) {
			prime[n] = true;
		}
		prime[0] = false;
		prime[1] = false;
		for (int n = 0; n < MAX_PRIME; n++) {
			if (prime[n]) {
				for (int i = 2; i * n < MAX_PRIME; i++) {
					prime[i * n] = false;
				}
			}
		}
	}
}
