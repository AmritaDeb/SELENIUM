package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoA {
	
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Test
	public void testDemoA(){
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");
		String aTitle=driver.getTitle();
		//String eTitle="actiTIME - Login";
		String eTitle="actiTIME - Dinga";
		/*
		 //if we compare by if block, then we will get the right comparison result in the console bt testng will always pass
		if(aTitle.equals(eTitle)){
			Reporter.log("Pass",true);
		}else{
			Reporter.log("Fail",true);
		}
		*/
		//If we do assertion(comparison), then testng will pass if comparison result is pass
		Assert.assertEquals(aTitle, eTitle);
		driver.close();
	}

}
