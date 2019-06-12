package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Composite {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		WebElement link = driver.findElement(By.partialLinkText("actiTIME"));
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.CONTROL).click(link).perform();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
