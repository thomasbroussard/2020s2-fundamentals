package fr.epita.dataproject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Launcher {

	public static void main(String[] args) throws IOException {
		File file = new File("data.csv");
		// TODO read the lines from the file
		List<String> lines = Files.readAllLines(file.toPath());
		// transform each line into a person
		List<Person> persons = new ArrayList<>();
		lines.remove(0);
		for (String line : lines) {

			try {
				// "Name", "Sex", "Age", "Height (in)", "Weight (lbs)"
				String[] fields = line.split(",");
				String name = fields[0].trim().replaceAll("\"", "");
				String sex = fields[1].trim().replaceAll("\"", "");
				Integer age = Integer.valueOf(fields[2].trim());
				Integer height = Integer.valueOf(fields[3].trim());
				Integer weight = Integer.valueOf(fields[4].trim());

				Person person = new Person(name, age, weight, height, sex);

				persons.add(person);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		System.out.println(persons.size());
		System.out.println(persons);

		
		List<Person> persons2 =from2dMatrix(to2dMatrix(persons));
		
		//persons2 and persons should be the same aside of the name
		
		
	}
	
	
	private static double[][] to2dMatrix(List<Person> persons) {
		double[][] results = new double[18][4];
		
		
		return results;
	}
	
	private static List<Person> from2dMatrix(double[][] persons) {
		List<Person> results = new ArrayList<Person>();
		
		return results;
				
	}

}
