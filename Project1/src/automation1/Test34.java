/*
  	Search igoogle drag and drop.
	perform drag and drop of block 1 to block 3
*/

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test34 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
		//find the element of Block 1
	WebElement source = driver.findElement(By.xpath("//h1[.='Block 1']"));
	
	WebElement target = driver.findElement(By.xpath("//h1[.='Block 3']"));
		//creating object using parameterized Action constructor
	Actions actions = new Actions(driver);
		//hovering the mouse pointer on the menu
	//actions.dragAndDrop(source, target).perform();
	actions.clickAndHold(source).moveToElement(target).release().perform();
	Thread.sleep(2000);
	
	driver.close();
	}
}