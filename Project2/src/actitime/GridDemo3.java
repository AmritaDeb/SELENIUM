package actitime;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridDemo3 {

	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Parameters({"ip","browser"})
	@Test
	public void testDemoA(@Optional("localhost") String ip, @Optional("chrome") String browser) throws Exception{
	
		URL url = new URL("http://" + ip + ":4444/wd/hub");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);
		WebDriver driver = new RemoteWebDriver(url,dc);
		driver.get("http://demo.actitime.com");
	}
}
