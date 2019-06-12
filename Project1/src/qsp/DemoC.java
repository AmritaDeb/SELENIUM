
/*
 * Q. Enter the URL of google.com, then enter the URL of gmail.com
 * 	  back to google.com
 * 	  forward to gmail.com
 * 	  refresh the page
*/

package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoC {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser
	WebDriver driver = new ChromeDriver();
	
	//Enter google.com
	driver.get("http://www.google.com");
	
	//maximize the browser
	driver.manage().window().maximize();
	
	//wait for 2sec
	Thread.sleep(2000);
	
	//Enter the gmail.com
	driver.navigate().to("http://gmail.com");
	
	//wait for 2sec
	Thread.sleep(2000);
	
	//Back to google.com
	driver.navigate().back();
	
	//wait for 2sec
	Thread.sleep(2000);
	
	//forward to gmail.com
	driver.navigate().forward();
	
	//wait for 2sec
	Thread.sleep(2000);
	
	//refresh the page
	driver.navigate().refresh();
	
	//wait for 2sec
	Thread.sleep(2000);
	
	//close the window
	driver.close();
	
	}
}
