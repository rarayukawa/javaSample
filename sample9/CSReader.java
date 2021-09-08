package sample9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSReader {
	private static final String COMMA = ",";
	
	public Plsyer[] readAll(String fileName) throws IOException {
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
				String[] fileElements = line.split(COMMA);
				if (fileElements.length != 4 || !Boolean.parseBoolean(fileElements[3])) {
					continue;
				}
				Plsyer plsyer = new Plsyer();
				plsyer.setPlayerName(fileElements[0]);
				plsyer.setAge(Integer.parseInt(fileElements[1]));
				plsyer.setPoint(Integer.parseInt(fileElements[2]));
				Object[] plsyers = {plsyer.getPlayerName(), plsyer.getAge(), plsyer.getPoint()};
				return (Plsyer[])plsyers;
			}
		}
	}
}
