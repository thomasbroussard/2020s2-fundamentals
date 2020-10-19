package fr.epita.bank.services;

import fr.epita.bank.datamodel.InvestmentAccount;
import fr.epita.bank.datamodel.Stock;
import fr.epita.bank.datamodel.StockOrder;

public class OrderService {
	
	private double commissionRatio;
	
	public StockOrder perform(Stock stock, InvestmentAccount account, int quantity) {
		
		StockOrder order = new StockOrder();
		order.setAccount(account);
		order.setStock(stock);
	
		double totalAmount = stock.getCurrentPrice() * quantity;
		double newBalance = account.getBalance() - totalAmount;
		double commission =  totalAmount * commissionRatio;
		order.setCommission(commission);
		account.setBalance(newBalance);
		
		return order;
		
	}

	public double getCommissionRatio() {
		return commissionRatio;
	}

	public void setCommissionRatio(double commissionRatio) {
		this.commissionRatio = commissionRatio;
	}

}
