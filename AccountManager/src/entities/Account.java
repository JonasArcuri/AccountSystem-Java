package entities;

public class Account {

	private int accountNumber;
	private String holder;
	private double deposit;
	
	//Construtores
	
	public Account()
	{
		
	}
	
	public Account(int accountNumber, String holder, double deposit) {
		super();
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.deposit = deposit;
	}

	//Getters e Setters
	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getDeposit()
	{
		return deposit;
	}
	
	
	
	
	//Métodos/Funções
	
	public double balance()
	{
		return deposit;
	}
	
	public void accountDeposit(double deposit)
	{
		this.deposit += deposit;
	}
	
	public void accountWithdraw(double withdraw)
	{
		this.deposit -= withdraw + 5;
	}
	
	public String toString()
	{
		return accountNumber + "," + " Holder: " + holder + ", " + "Balance: $" +
		String.format("%.2f" , balance()); 
	}
	
}
