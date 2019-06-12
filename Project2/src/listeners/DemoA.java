package listeners;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Result.class)
public class DemoA {

	@Test
	public void testA(){
		Reporter.log("testA",true);
	}
	@Test
	public void testB(){
		Reporter.log("testB",true);
		Assert.fail();
	}
	
}
