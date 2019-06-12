package actitime;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridDemo8 {

//	static{
//		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver","./driver/firefoxdriver.exe");
//	}
	@Parameters({"ip","browser"})
	@Test
	public void testDemoA(String ip, String browser) throws Exception{
	
		URL url = new URL("http://" + ip + ":4444/wd/hub");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);
		WebDriver driver = new RemoteWebDriver(url,dc);
		driver.get("http://demo.actitime.com");
		for(int i=1; i<=5; i++){
			WebElement unTB = driver.findElement(By.id("username"));
			//Thread.sleep(2000);
			unTB.clear();
			unTB.sendKeys("admin");
		}
		driver.close();
	}
}
