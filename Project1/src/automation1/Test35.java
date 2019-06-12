/*
  	Go to actitime.com, right click on actiTIME Inc link which will display context menu,
  	select 'open link in new window', switch to new window,
  	print it's title & url, close new window
*/

package automation1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test35 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
	Actions actions = new Actions(driver);
	
	actions.contextClick(link).perform();
	//actions.moveToElement(link).perform();
	//actions.sendKeys("w").perform();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_W);
	Thread.sleep(2000);
	
	Set<String> allWHS = driver.getWindowHandles();
	for(String wh : allWHS){
		Thread.sleep(2000);
		driver.switchTo().window(wh);
		Thread.sleep(2000);
	}
	String title = driver.getTitle();
	System.out.println(title);
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	Thread.sleep(2000);
	driver.close();
	}
}