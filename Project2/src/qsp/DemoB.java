package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoB {
	
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Test
	public void testDemoB(){
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");
		String aTitle=driver.getTitle();
		String eTitle="actiTIME - Login";
		SoftAssert s = new SoftAssert();
		s.assertEquals(aTitle, eTitle);
		driver.close();
		s.assertAll();
	}

}
