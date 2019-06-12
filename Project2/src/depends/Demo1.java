package depends;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void createUser(){
		Reporter.log("createUser",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods="createUser")
	public void deleteUser(){
		Reporter.log("deleteUser",true);
	}
}
