package encryptix;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		BankAccount userAccount = new BankAccount(1000.0);
		ATM atm = new ATM(userAccount);
		
		Scanner scanner = new Scanner(System.in);
		while(true) 
		{
			atm.displayMenu();
			System.out.println("Enter your Choice");
			int choice = scanner.nextInt();
			atm.processOption(choice);
		}
		
	}

}
