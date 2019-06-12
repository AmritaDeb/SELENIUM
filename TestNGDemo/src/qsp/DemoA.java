package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {

	@Test
	public void testA(){
		//System.out.println("TestA is executing");
		Reporter.log("TestA is executing",true);
	}
}
