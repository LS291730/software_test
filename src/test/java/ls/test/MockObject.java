package ls.test;

import org.junit.Test;
import junit.framework.TestCase;
import static org.mockito.Mockito.*;

public class MockObject extends TestCase{
	
	@Test
	public void testMockAccount(){
		User user = mock(User.class);
		when(user.getAccount()).thenReturn("SX1916020");
		assertEquals("SX1916020", user.getAccount());
	}
	
	@Test
	public void testMockName(){
		User user = mock(User.class);
		when(user.getName()).thenReturn("liusu");
		assertEquals("liusu", user.getName());
	}
	
}
