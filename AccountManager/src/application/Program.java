package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {
	public static void main(String[] args)
	{
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		while (true) 
		{
			int res;
			double deposit = 0;
			int[] accountIds = {};
			String[] accountNames = {};
			
			System.out.println("Hello, Welcome to Bank of America!");
			System.out.println();
			System.out.println("--= Menu =--");
			System.out.println("1 - Sign Account");
			System.out.println("2 - Account Balance");
			System.out.println("3 - Registry Files");
			System.out.println("0 - Exit Program");
			
			System.out.println(res = sc.nextInt());
			
			
			
			if (res == 1)
			{
				System.out.println("Please, Enter Account Number: ");
				int accountNumber = sc.nextInt();
				System.out.println("Enter account holder: ");
				sc.nextLine();
				String holder = sc.next();
				System.out.println("Is there an initial deposit? (y/n)");
				String awnser = sc.next();
				
				if (awnser.contains("y") || awnser.contains("Yes") || awnser.contains("yes") || awnser.contains("Y"))
				{
					System.out.println("Enter initial deposit value: ");
					deposit = sc.nextDouble();
				}
				else if (awnser.contains("n") || awnser.contains("no") || awnser.contains("N") || awnser.contains("NO"))
				{
					Account account = new Account(accountNumber, holder, deposit);
				}
				
				else {
					System.out.println("Error!");
				}
				
				
				Account account = new Account(accountNumber, holder, deposit);
				
				System.out.println();
				
				System.out.println("Account Data: " + account);
				System.out.println("Enter a Deposit Value: ");
				deposit = sc.nextDouble();
				account.accountDeposit(deposit);
				System.out.println("Updated Account Data: " + account);
				
				System.out.println("Enter a withdraw value: ");
				double withdraw = sc.nextDouble();
				account.accountWithdraw(withdraw);
				System.out.println("Updated Account Data: " + account);
				System.out.println();
				System.out.println("End of Program!");
			
			} // Final do 1° If
			
			else if(res == 2)
			{
				System.out.println("Building!");
			}
			else if(res == 3)
			{
				System.out.println("Building!");
			}
			else if(res == 0)
			{
				System.out.println("Thanks for Using!");
			}
		}
	}
	
}
