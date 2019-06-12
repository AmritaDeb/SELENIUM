/*
  	Go to www.myntra.com,
	hover on Men,
	click on sunglasses and frames,
	print the price of the 1st product.
*/

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test30 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	String xp = "//a[contains(text(),'Men')]";
		//find the element of Men in menu
	WebElement menu = driver.findElement(By.xpath(xp));
		//creating object using parameterized Action constructor
	Actions actions = new Actions(driver);
		//hovering the mouse pointer on the menu
	actions.moveToElement(menu).perform();
	Thread.sleep(2000);
		//find the Sunglasses and Frames and click on it
	driver.findElement(By.xpath("//a[.='Sunglasses and Frames' and @href='/men-sunglasses']")).click();
	Thread.sleep(2000);
		//find the price of the 1st product and click on it
	String price = driver.findElement(By.xpath("(//img)[1]/../div/div[2]/span/span[1]")).getText();
	System.out.println(price);
	
	driver.close();
	}
}