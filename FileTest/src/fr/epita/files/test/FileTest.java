package fr.epita.files.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) throws IOException {
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
