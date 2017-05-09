
public class LoanAccount {
	int AccountNumber;
	String Name;
	int Balance;
	
	public LoanAccount(int aNumber, String name, int inBalance) {
		// TODO Auto-generated constructor stub
		AccountNumber=aNumber;
		Name=name;
		Balance=inBalance;
	}
	
	public void instalment(int amount)
	{
		if(Balance<=500)
			{
			System.out.println("Balance is low cant pay the instalment.");
				
			}
		else
			Balance-=amount;
		System.out.println("Balance after paying instament is "+Balance);
			
	}
	
	int getBalance()
	{
		return Balance;
	}

}
