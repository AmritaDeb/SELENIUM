package home1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();        //open chrome browser
	driver.get("http://www.naukri.com");         //Enter naukri.com
	driver.manage().window().maximize();        //maximize the browser
	Thread.sleep(2000);
	
	/* close only parent browser */
	
	Set<String> allWHS = driver.getWindowHandles();
	for(String wh:allWHS)
	{
		System.out.println(wh);
		driver.close();
	}
	}
}