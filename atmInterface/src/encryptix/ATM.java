package encryptix;
import java.util.Scanner;
public class ATM {

	private BankAccount account;
	public ATM(BankAccount account) 
	{
	this.account = account;
	}
	public void displayMenu() 
	{
		System.out.println("  ATM Menu  ");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Check Balance");
		System.out.println("4. Exit");
	}
	public void processOption(int option) {
		Scanner scanner = new Scanner(System.in);
		switch (option) {
		case 1:
			System.out.println("Enter amount to withdraw:- ");
			double withdrawAmount = scanner.nextDouble();
			if(withdrawAmount <=0) 
			{
				System.out.println("Invalid amound..");
			}
			else {
				account.withdraw(withdrawAmount);
				
			}
			break;
		case 2:
			System.out.println("Enter amount to deposit: ");
			double depositAmount = scanner.nextDouble();
			account.deposit(depositAmount);
			
			break;
		case 3:
			System.out.println("Your balance is: "+account.getBalance());
			break;
		case 4:
			System.out.println("Exciting. \nThank you for using our ATM....");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid option. ");
			scanner.close();
		}
	}
	
}