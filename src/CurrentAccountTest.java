import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CurrentAccountTest {
	CurrentAccount myCurrentAccount;
	@Before
	public void setUp() throws Exception {
		myCurrentAccount = new CurrentAccount(101,"Pratisti",1000);
	}

	@Test
	public void testDeposit() {
		//fail("Not yet implemented");
		myCurrentAccount.deposit(500);
		assertEquals(1500,myCurrentAccount.getBalance());
	}

	@Test
	public void testWithdraw() {
		//fail("Not yet implemented");
		System.out.println(myCurrentAccount.getBalance());
		myCurrentAccount.withdraw(100);
		System.out.println(myCurrentAccount.getBalance());
		assertEquals(900,myCurrentAccount.getBalance());
		
	}

	@Test
	public void testGetBalance() {
		//fail("Not yet implemented");
		assertEquals(1000,myCurrentAccount.getBalance());
	}

}
