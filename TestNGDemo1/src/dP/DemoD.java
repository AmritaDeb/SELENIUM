package dP;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoD {
	
	@BeforeMethod(alwaysRun=true)
	public void login(){
		Reporter.log("login",true);
	}
	@AfterMethod(alwaysRun=true)
	public void logout(){
		Reporter.log("logout",true);
	}
	@Test(priority=1,groups={"user","smoke"})
	public void createUser(){
		Reporter.log("createUser",true);
	}
	@Test(priority=2,groups={"user"},enabled=false)
	public void editUser(){
		Reporter.log("editUser",true);
	}
	@Test(priority=3,groups={"user"})
	public void deleteUser(){
		Reporter.log("deleteUser",true);
	}
	@Test(priority=4,groups={"product","smoke"})
	public void createProduct(){
		Reporter.log("createProduct",true);
	}
	@Test(priority=5,groups={"product"})
	public void deleteProduct(){
		Reporter.log("deleteProduct",true);
	}

}
