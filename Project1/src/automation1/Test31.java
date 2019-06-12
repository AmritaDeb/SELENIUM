/*
  	Go to www.snapdeal.com,
	hover on All offers,
	click on Rakhi store,
	print name of the last product.
*/

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test31 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	String xp = "//span[.='All Offers']";
		//find the element of All Offers in hamburger menu
	WebElement menu = driver.findElement(By.xpath(xp));
		//creating object using parameterized Action constructor
	Actions actions = new Actions(driver);
		//hovering the mouse pointer on the menu
	actions.moveToElement(menu).perform();
	Thread.sleep(2000);
		//find the Rakhi Store and click on it
	driver.findElement(By.linkText("Rakhi Store")).click();
	Thread.sleep(2000);
		//find the price of the 1st product and click on it
	String price = driver.findElement(By.xpath("//img[contains(@src,'VD_Rakhi_NMP_4H_DhoopsIncenseSticks')]/../div[1]")).getText();
	System.out.println(price);
	
	driver.close();
	}
}