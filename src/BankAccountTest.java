import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	BankAccount myAccount;
	@Before
	public void setUp() throws Exception { 
		myAccount = new BankAccount(101,"Pratisti",1000);
	}

	@Test
	public void testDeposit() {
		//fail("Not yet implemented");
		myAccount.deposit(500);
		assertEquals(1500,myAccount.getBalance());
	}

	@Test
	public void testWithdraw() {
		//fail("Not yet implemented");
		System.out.println(myAccount.getBalance());
		myAccount.withdraw(100);
		System.out.println(myAccount.getBalance());
		assertEquals(900,myAccount.getBalance());
		
	}

	@Test
	public void testGetBalance() {
		//fail("Not yet implemented");
		assertEquals(1000,myAccount.getBalance());
	}

}
