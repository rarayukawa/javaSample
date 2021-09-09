package sample9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSReader {
	public Plsyer[] readAll(String fileName) throws IOException {
		Plsyer[] players = new Plsyer[100];
		int i = 0;
		try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			boolean isNotHeaderLine = false;
			while ((line = reader.readLine()) != null) {
				if (line.trim().isEmpty()) {
					continue;
				}
				if (!isNotHeaderLine) {
					isNotHeaderLine = true;
					continue;
				}
				String[] fileElements = line.split(",");
				if (fileElements.length != 4 || !Boolean.parseBoolean(fileElements[3])) {
					continue;
				}
				players[i] = new Plsyer(fileElements[0], Integer.parseInt(fileElements[1]), Long.parseLong(fileElements[2]));
				i++;
			}
			Plsyer[] player = new Plsyer[i];
			for (int j = 0; j < i; j++) {
				player[j] = players[j];
			}
			return player;
		}
	}
}
