package ch1.example1;

/**
 * A simple model for a consumer credit card.
 * 
 * @author i80583
 * 
 */
public class CreditCard {
	private String customer; // name of the customer (e.g., "John Bowman")
	private String bank; // name of the bank (e.g., "California Savings")
	private String account; // account identifier (e.g., "5391 0375 9387 5309")
	private int limit; // credit limit (measured in dollars)
	protected double balance; // current balance (measured in dollars)

	// Constructors:
	/**
	 * Constructs a new credit card instance.
	 * @param cust             the name of the customer (e.g., "John Bowman")
	 * @param bk             the name of the bank (e.g., "California Savings")
	 * @param acnt             the account identifier (e.g., "5391 0375 9387 5309")
	 * @param lim            the credit limit (measured in dollars)
	 * @param initialBal           the initial balance (measured in dollars)
	 */
	public CreditCard(String cust, String bk, String acnt, int lim,
			double initialBal) {

		customer = cust;
		bank = bk;
		account = acnt;
		limit = lim;
		balance = initialBal;
	}

	/**
	 * Constructs a new credit card instance.
	 * @param cust  the name of the customer (e.g., "John Bowman")
	 * @param bk  the name of the bank (e.g., "ktm Savings")
	 * @param acnt  the account identifier (e.g., "6666 0375 9387 5309")
	 * @param lim  the credit limit (measured in dollars)
	 */
	public CreditCard(String cust, String bk, String acnt, int lim) {
		this(cust, bk, acnt, lim, 0.0); // use a balance of zero as default
	} // Accessor methods:
/**
 * 
 * @return String value
 */
	public String getCustomer() {
		return customer;
	}

	public String getBank() {
		return bank;
	}

	public String getAccount() {
		return account;
	}

	public int getLimit() {
		return limit;
	}

	public double getBalance() {
		return balance;
	} // Update methods:

	
	/**
	 * Charges the given price to the card, assuming sufficient credit limit
	 * @param price rice the amount to be charged
	 * @return if charge was accepted; false if charge was denied
	 */
	public boolean charge(double price) { // make a charge
		System.out.println(price + balance);
		if (price + balance > limit) // if charge would surpass limit
			return false; // refuse the charge
		// at this point, the charge is successful
		balance += price; // update the balance
		return true; // announce the good news
	}

	public void makePayment(double amount) { // make a payment
		balance -= amount;
	} // Utility method to print a card's information

	/**
	 * PrintSummary of CreditCard
	 * @param card CreditCard
	 */
	public static void printSummary(CreditCard card) {
		System.out.println("Customer = " + card.customer);
		System.out.println("Bank = " + card.bank);
		System.out.println("Account = " + card.account);
		System.out.println("Balance = " + card.balance); // implicit cast
		System.out.println("Limit = " + card.limit); // implicit cast
		System.out.println("-------------------------");
	} // main

	public static void main(String[] args) {
		CreditCard[] wallet = new CreditCard[3];
		wallet[0] = new CreditCard("John Bowman", "California Savings",
				"5391 0375 9387 5309", 5000);
		wallet[1] = new CreditCard("John Bowman", "California Federal",
				"3485 0399 3395 1954", 3500);

		wallet[2] = new CreditCard("John Bowman", "California Finance",
				"5391 0375 9387 5309", 2500, 300);
		System.out.println("====================***********=============");
		for (CreditCard card : wallet) {
			//card.printSummary(card);
		
			CreditCard.printSummary(card); // calling static method
		}
		System.out.println("====================***********=============");
		for (int val = 1; val <= 16; val++) {
			wallet[0].charge(3 * val);
			wallet[1].charge(2 * val);
			wallet[2].charge(val);
		}
		for (CreditCard card : wallet) {
			CreditCard.printSummary(card); // calling static method

			while (card.getBalance() > 200.0) {
				card.makePayment(2800);
				System.out.println("New balance = " + card.getBalance());
			}
			System.out.println("================");
		}

	}

}
