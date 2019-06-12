
/*
 * Qs. Find the WebElement by tagName locator and click on it 
*/

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoK {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
	WebDriver driver = new ChromeDriver();        //open chrome browser
	driver.get("file:///C:/Users/Admin/Desktop/qsp.html");
	
	//find the element by tag name a and store its address
	WebElement e = driver.findElement(By.tagName("a"));
	
	//click on the element using its address
	e.click();
	
	
	}
}
