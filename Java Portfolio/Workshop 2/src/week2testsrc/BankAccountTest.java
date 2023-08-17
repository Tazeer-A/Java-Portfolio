package week2testsrc;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import week2src.BankAccount;

public class BankAccountTest {

	@Test
	public void testBankAccount() {
		BankAccount acc = new BankAccount();
		assertEquals(0, acc.getBalance());
	}

	@Test
	void testBankAccountInt() {
		BankAccount acc = new BankAccount(1000);
		assertEquals(1000, acc.getBalance());
	}

	@Test
	void testGetBalance() {
		BankAccount acc = new BankAccount(1000);
		assertEquals(1000, acc.getBalance());
	}

	@Test
	void testDeposit() {
		BankAccount acc = new BankAccount();
		acc.deposit(900);
		assertEquals(900, acc.getBalance());
	}

	@Test
	void testWithdraw() {
		BankAccount acc = new BankAccount();
		acc.deposit(900);
		acc.withdraw(500);
		assertEquals(400, acc.getBalance());
	}
	
	void testFailedDeposit() {
		BankAccount acc = new BankAccount();
		acc.deposit(-1000);
		assertEquals(0, acc.getBalance());
	}
	
	void testFailedWithdraw() {
		BankAccount acc = new BankAccount();
		acc.withdraw(500);
		assertEquals(0, acc.getBalance());
	}
    
	void testFailedBalance() {
		BankAccount acc = new BankAccount();
		acc.deposit(900);
		acc.withdraw(-1000);
		int currentbalance=acc.getBalance();
		System.out.println(currentbalance);
		assertEquals(1000, currentbalance);
	}
}
