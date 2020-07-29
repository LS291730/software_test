package ls.test;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//集成测试
@RunWith(Suite.class)
@SuiteClasses({ UnitTest.class})
public class AllTest{	
	public static TestSuite suite(){
		TestSuite suite = new TestSuite("All JUnit Tests");
		suite.addTestSuite(UnitTest.class);
		return suite;
	}
}
