package fr.epita.dataproject;

import java.io.File;
import java.util.List;

public class Launcher {
	
	public static void main(String[] args) {
		File file = new File("data.csv");
		//TODO read the lines from the file
		List<String> lines = null; //TODO replace by file reading
		//transform each line into a person
		List<Person> persons = new ArrayList<>();
		for (String line : lines) {
			Person person = new Person();
			//TODO fill the person
			persons.add(person);
		}
		
		System.out.println(persons);
		
		
	}

}
