import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BankAccountTest.class, LoanAccountTest.class, CurrentAccountTest.class })
public class AllTests {

}
