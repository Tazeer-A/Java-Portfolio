package week2src;

public class BankAccount {
   private int balance;
   
   public BankAccount() {
	   this.balance = 0;
   }
   
   public BankAccount(int amount) {
	   deposit(amount);
   }
   
   public int getBalance() {
	   return balance;
   }
   
   public void deposit(int amount) {
	   if (amount < 0) {
		   System.out.println("Invalid amount has been deposited");
		   
	   }
	   else {
		   balance = balance + amount;
	   }
   }
   
   public void withdraw(int WithdrawAmount) {
	   if (WithdrawAmount<0) {
		   System.out.println("Amount is negative");
		   
	  }
	   else {
		   if (balance > 0 ) {
			   if (balance > WithdrawAmount) {
				   balance = balance - WithdrawAmount;
				   System.out.println("Balance withdraw is successful");
				   
			   }
			      else {
				   System.out.println("Not enough balance");
			   }
		  }else {
			  System.out.println("The balance is 0");
		  }
	   }
   }
}
