package fr.epita.bank.launchers;

import fr.epita.bank.datamodel.Customer;
import fr.epita.bank.datamodel.InvestmentAccount;
import fr.epita.bank.datamodel.SavingsAccount;
import fr.epita.bank.datamodel.Stock;
import fr.epita.bank.datamodel.StockOrder;
import fr.epita.bank.services.AccountService;
import fr.epita.bank.services.OrderService;

public class Launcher {

	public static void main(String[] args) {
		System.out.println("hello!");
		
		Customer customer = new Customer();
		customer.setName("Thomas");
		customer.setAddress("Paris");
		
		System.out.println("Hi, "+customer.getName());
		
		InvestmentAccount account = new InvestmentAccount();
		account.setBalance(200);
		
		Stock stock = new Stock();
		stock.setName("gold");
		stock.setCurrentPrice(200);

		OrderService service = new OrderService();
		service.setCommissionRatio(0.02);
		service.perform(stock, account, 3);
		 
		System.out.println(account.getBalance());
		
		
		/*---------------------------------------------------*/
		AccountService accountService = new AccountService();
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.setBalance(1000);
		savingsAccount.setInterestRate(0.0075);
		double interests = accountService.computeInterest(savingsAccount);
		System.out.println(interests);
		
		accountService.withDraw(savingsAccount, interests);
		
		System.out.println(savingsAccount.getBalance());
		
		
	
	}
}
