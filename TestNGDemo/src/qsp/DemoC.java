package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoC {

	@BeforeClass
	public void opneApp(){
		Reporter.log("Open App",true);
	}
	@AfterClass
	public void cloaseApp(){
		Reporter.log("Close App",true);
	}
	@BeforeMethod
	public void login(){
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void logout(){
		Reporter.log("Logout",true);
	}
	@Test(priority=-1,invocationCount=2)
	public void createUser(){
		Reporter.log("CreateUser",true);
	}
	@Test
	public void editUser(){
		Reporter.log("EditUser",true);
	}
	@Test(priority=1)
	public void deleteUser(){
		Reporter.log("DeleteUser",true);
	}
}