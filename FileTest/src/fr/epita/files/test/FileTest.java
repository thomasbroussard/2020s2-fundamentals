package fr.epita.files.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// fileWrite();
		List<String> listOfLines = Files.readAllLines(new File("test.log").toPath());
		System.out.println(listOfLines);

		for (String line : listOfLines) {
			line.trim();// remove trailing and starting spaces
			line.replaceAll("\"", ""); // remove double quotes from the whole string.
			try {
				Integer.valueOf(line);
			} catch (NumberFormatException nfe) {
				nfe.printStackTrace();
			}
		}

	}

	private static void fileWrite() throws IOException {
		File file = new File("./test.log");
		boolean fileExists = file.exists();
		System.out.println("file exists : " + fileExists);

		if (!fileExists) {
			file.createNewFile();
		}
		FileWriter fileWriter = new FileWriter(file, true);
		String lineSep = System.getProperty("line.separator");
		fileWriter.append("this is a test" + lineSep);

		fileWriter.close();
	}

}
