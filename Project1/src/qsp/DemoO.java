
/*
 * Qs. Find the WebElement by xpath locator and click on it 
*/

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoO {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
	WebDriver driver = new ChromeDriver();        //open chrome browser
	driver.get("file:///D:/QSpiders/SELENIUM/html/xpath.html");
	
	driver.findElement(By.xpath("./html/body/a")).click();
	Thread.sleep(2000);
	
	//driver.close();
	
	}
}
