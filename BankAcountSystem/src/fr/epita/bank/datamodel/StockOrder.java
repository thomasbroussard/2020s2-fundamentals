package fr.epita.bank.datamodel;

public class StockOrder {
	
	private int quantity;
	private double unitPrice;
	private double commission;
	
	private Stock stock;
	private InvestmentAccount account;
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public InvestmentAccount getAccount() {
		return account;
	}
	public void setAccount(InvestmentAccount account) {
		this.account = account;
	}
	
	

}
