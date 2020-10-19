package fr.epita.bank.services;

import fr.epita.bank.datamodel.SavingsAccount;

public class AccountService {
	
	/**
	 * this method is taking the balance of the account and multiply it by the interest rate. 
	 * 
	 * @return the monthly calculation for interest
	 */
	public double computeInterest(SavingsAccount account) {
		return account.getInterestRate() * account.getBalance();
	}
	
	
	/**
	 * withdraws some money from the account
	 * @param amount
	 */
	public void withDraw(SavingsAccount account, double amount) {
		//TODO check if withdrawal will not provoke a negative balance!
		account.setBalance(account.getBalance() - amount);
	}

}
