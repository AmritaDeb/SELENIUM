package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB {

	@Test
	public void testB(){
		//System.out.println("TestA is executing");
		Reporter.log("TestB is executing",true);
	}
}
