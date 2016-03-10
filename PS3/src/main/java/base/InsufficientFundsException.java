package base;

public class InsufficientFundsException extends Exception {

	//Account
	private double amount;
	
	public InsufficientFundsException(double amount) {
		this.amount = amount;
		} 
	  
	public double getAmount() {
		return amount;
	   }	
}
