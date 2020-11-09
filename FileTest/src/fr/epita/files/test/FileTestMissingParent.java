package fr.epita.files.test;

import java.io.File;
import java.io.IOException;

public class FileTestMissingParent {
	
	public static void main(String[] args) throws IOException {
		File file = new File("S:/tmp/test/java/file.txt");
		
		boolean exists = file.exists();
		System.out.println("file exists : " + exists);
		
	
		
		File parentFile = file.getParentFile();
		System.out.println("is the parent file a directory? : " + parentFile.isDirectory());
		
		parentFile.mkdirs();
		
		System.out.println("is the parent file a directory? : " + parentFile.isDirectory());
		
		file.createNewFile();
		
		System.out.println("file exists : " + file.exists());
		
		File workingDirectory = new File(".");
		System.out.println("working in :" + workingDirectory.getAbsolutePath());
	}

}
