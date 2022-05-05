package Test;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(ListenerTest.class)
public class DemoTest {
	
	@Test
	public void test() {
		System.out.println("I have modified the test ");
	}
	
	
	@Test
	public void test2() {
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"test2"})
	public void test3() {
		
	}
	
}
