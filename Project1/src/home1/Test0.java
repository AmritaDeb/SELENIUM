package home1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
				
		//open chrome browser
		WebDriver driver = new ChromeDriver(); 
		//enter the URL
		driver.get("http://www.naukri.com");
		//wait for 2mins
		Thread.sleep(2000);
		//get window handle
		String parent = driver.getWindowHandle();
		//get window handles
		Set<String> allWHS = driver.getWindowHandles();
		allWHS.remove(parent);
		for(String wh : allWHS)
		{
			System.out.println(wh);
			driver.switchTo().window(wh).close();
		}
	}
}
