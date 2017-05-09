import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LoanAccountTest {
	LoanAccount myLoan;
	@Before
	public void setUp() throws Exception {
		myLoan = new LoanAccount(101,"Pratisti",1000);
	}



	@Test
	public void testInstalment() {
		//fail("Not yet implemented");
		myLoan.instalment(100);
		assertEquals(900,myLoan.getBalance());
	}

}
