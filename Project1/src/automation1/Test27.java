/*
 * Go to vtiger.com, click on Products dropdown menu, select Sales CRM option
 * */

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test27 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("http://www.vtiger.com/");
	Thread.sleep(2000);
	String xp = "//a[contains(text(),'Products')]";
		//find the element of Products in menu
	WebElement menu = driver.findElement(By.xpath(xp));
		//creating object using parameterized Action constructor
	Actions actions = new Actions(driver);
		//hovering the mouse pointer on the menu
	actions.moveToElement(menu).perform();
	Thread.sleep(2000);
		//click on the Sales CRM
	driver.findElement(By.xpath("//div[contains(text(),'Sales CRM')]")).click();
	driver.close();
	}
}