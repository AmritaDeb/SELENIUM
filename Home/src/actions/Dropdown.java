package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("http://www.vtiger.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	String xp = "//a[contains(text(),'Resources')]";
	WebElement menu = driver.findElement(By.xpath(xp));
	
	Actions actions = new Actions(driver);
	actions.moveToElement(menu).perform();	
	
	driver.findElement(By.xpath("//a[.='Contact']")).click();
	Thread.sleep(2000);
		
	driver.close();
	}
}
