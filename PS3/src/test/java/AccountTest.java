import static org.junit.Assert.*;

import org.junit.Test;
import base.Account;
import base.InsufficientFundsException;

public class AccountTest {

	//Test getMonthlyInterestRate()
	@Test
	public void testAccount() {
		Account test = new Account(1122, 2000);
		test.setAnnualInterestRate(4.5);
		double ExpectedResult = 0.375;
		double ActualResult = test.getMonthlyInterestRate();
		assertEquals(ExpectedResult, ActualResult, 0.01);
		System.out.println("The monthly interest rate is " + test.getMonthlyInterestRate() + "%.");
		
	}

	//Test Withdraw()
	@Test
	public void testWithdraw() {
		Account test = new Account(1122, 20000);
		test.Withdraw(2500);
		double ExpectedResult = 17500;
		double ActualResult = test.getBalance();
		assertEquals(ExpectedResult, ActualResult, 0.01);
		System.out.printf("The balance in the account after withdraw is $%1.2f. \n", test.getBalance());
	}


	//Test Deposit()
	@Test
	public void testDeposit() {
		Account test = new Account(1122, 20000);
		test.Deposit(3000);
		double ExpectedResult = 23000;
		double ActualResult = test.getBalance();
		assertEquals(ExpectedResult, ActualResult, 0.01);
		System.out.printf("The balance in the account after a deposit is $%1.2f. \n", test.getBalance());
	}
	
	//Test GetDateCreated()
	@Test
	public void testDateCreated() {
		Account test = new Account(1122, 20000);
		test.getDateCreated();
		System.out.println("The date the account was created is " + test.getDateCreated() + ".");
	}

	//Test OverDraw() 
	@Test (expected = InsufficientFundsException.class)
	public void OverDraw() throws Exception {
		Account test = new Account(1122, 20000);
		test.OverDraw(30000);
	}
}