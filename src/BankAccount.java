
public class BankAccount {
	int AccountNumber;
	String Name;
	int Balance;
	
	public BankAccount(int aNumber, String name, int inBalance) {
		// TODO Auto-generated constructor stub
		AccountNumber=aNumber;
		Name=name;
		Balance=inBalance;
	}

	public void deposit(int amount)
	{
		Balance+=amount;
	}
	
	public void withdraw(int amount)
	{
		if(Balance<=500)
		{
			System.out.println("Balance is low cant withdraw.");
		}
	else
		Balance-=amount;
	System.out.println("Balance after withdraw is "+Balance);
		
	}
	
	int getBalance()
	{
		return Balance;
	}

}
