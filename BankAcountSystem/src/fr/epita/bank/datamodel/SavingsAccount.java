package fr.epita.bank.datamodel;

public class SavingsAccount extends Account{
	private double interestRate;
	
	/**
	 * this method is taking the balance of the account and multiply it by the interest rate. 
	 * 
	 * @return the monthly calculation for interest
	 */
	public double computeInterest() {
		return this.interestRate * getBalance();
	}
	
	
	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


	/**
	 * withdraws some money from the account
	 * @param amount
	 */
	public void withDraw(double amount) {
		//TODO check if withdrawal will not provoke a negative balance!
		this.setBalance(getBalance() - amount);
	}
}
