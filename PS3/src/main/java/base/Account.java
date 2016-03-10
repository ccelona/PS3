package base;

import java.util.Date;

public class Account {
	
	//Data Fields
	private int id; 
	private double balance;
	private double annualInterestRate; //stores the current interest rate.
	private Date dateCreated; //stores the date when the account was created.
	
	//Constructors
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	public Account(int newID, double newBalance) {
		id = newID;
		balance = newBalance;
		dateCreated = new Date();
	}
	

	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
	//Methods
	
	//returns the monthly interest rate
	public double getMonthlyInterestRate() { 
		return annualInterestRate/12;
	}
	 
	 //Withdraw draws an amount from the account
	 public double Withdraw(double amountDrawn) {
		 return balance -= amountDrawn;
	 }
	
	//Deposits an amount to the account
	public double Deposit(double amountDeposited) {
		return balance += amountDeposited;
	}
	
	//Returns the date the account was created
	public Date getDateCreated() { 
	return dateCreated;
	}
	
	//OverDraw throws an exception
	 public void OverDraw(double amountDrawn) throws InsufficientFundsException { 
		 if (amountDrawn <= balance) {
			  balance -= amountDrawn;
		 }
		 else {
			 double needs = amountDrawn - balance;
			 throw new InsufficientFundsException(needs);
		 }
		 }
	 
}

