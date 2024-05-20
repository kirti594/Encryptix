package encryptix;

public class BankAccount {
	private double balance;
	
	public BankAccount(double initialBalance) 
	{
		balance = initialBalance;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double amount) 
	{
		balance += amount;
		System.out.println("Deposit successful...\n New balance: "+balance);
	}
	public boolean withdraw(double amount) 
	{
		if (amount>balance) 
		{
			System.out.println("Insufficient funds. Withdrawal failed..");
			return false;
		}else 
		{
			balance -=amount;
			System.out.println("Withdrawal successful...\n New Balance:- " +balance);
			return true;
		}
	}
}
