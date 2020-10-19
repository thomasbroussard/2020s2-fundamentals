package fr.epita.bank.launchers;

import fr.epita.bank.datamodel.Customer;

public class Launcher {

	public static void main(String[] args) {
		System.out.println("hello!");
		
		Customer customer = new Customer();
		customer.setName("Thomas");
		customer.setAddress("Paris");
		
		System.out.println("Hi, "+customer.getName());
		
	
	}
}
