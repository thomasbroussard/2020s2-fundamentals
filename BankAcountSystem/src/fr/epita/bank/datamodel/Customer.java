package fr.epita.bank.datamodel;

public class Customer {
	
	
	private String name;
	private String address;
	
	private SavingsAccount savingsAccount;
	private InvestmentAccount investmentAccount;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	
	

}