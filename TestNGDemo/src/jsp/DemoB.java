package jsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB extends BaseTest {

	@Test
	public void testB1(){
		Reporter.log("TestB1",true);
	}
	@Test
	public void testB2(){
		Reporter.log("TestB2",true);
	}
	
}
