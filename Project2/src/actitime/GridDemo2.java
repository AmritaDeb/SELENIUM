package actitime;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemo2 {

	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void testDemoA() throws Exception{
		
		String ip = "192.168.43.133";
		String browser = "chrome";
		URL url = new URL("http://" + ip + ":4444/wd/hub");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);
		WebDriver driver = new RemoteWebDriver(url,dc);
		driver.get("http://demo.actitime.com");
	}
}
