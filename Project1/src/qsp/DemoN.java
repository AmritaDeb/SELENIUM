
/*
 * Qs. Find the WebElement by cssSelector & other locators, click on it and check the results are same or not 
*/

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoN {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
	WebDriver driver = new ChromeDriver();        //open chrome browser
	driver.get("file:///D:/QSpiders/SELENIUM/html/qsp.html");
	
	// # means id
	driver.findElement(By.cssSelector("#a1")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	
	driver.findElement(By.id("a1")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	
	// . means class
	driver.findElement(By.cssSelector(".c1")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	
	driver.findElement(By.className("c1")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	
	// tagname
	driver.findElement(By.cssSelector("a")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	
	driver.findElement(By.tagName("a")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	
	
	}
}
