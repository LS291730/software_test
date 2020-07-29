package ls.test;
import org.junit.Test;
import junit.framework.TestCase;

//单元测试
public class UnitTest extends TestCase {
	//下面就其User类进行单元测试
	@Test
	public void testSetAccount(){
		User user = new User();
		user.setAccount("SX1916020");
		assertEquals("SX1916020", user.getAccount());
	}
	
	@Test
	public void testSetName(){
		User user = new User();
		user.setName("liusu");
		assertEquals("liusu", user.getName());
	}

}
