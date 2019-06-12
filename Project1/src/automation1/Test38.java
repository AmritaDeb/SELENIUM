/*
  	Double click on folder in google drive without using Thread.sleep()
*/

package automation1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test38 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Enter the URL
	driver.get("https://drive.google.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//a[.='Go to Google Drive'])[4]")).click();
	
	WebElement u_n = driver.findElement(By.id("identifierId"));
	u_n.sendKeys("amritadebbarman@gmail.com");
	driver.findElement(By.xpath("//span[.='Next']")).click();
	
	WebElement pass = driver.findElement(By.name("password"));
	pass.sendKeys("161amrita2541");
	driver.findElement(By.xpath("//span[.='Next']")).click();
	
	driver.findElement(By.xpath("//span[.='My Drive']")).click();
	
	Actions actions = new Actions(driver);
	WebElement target = driver.findElement(By.xpath("//span[.='Tutorials']"));
	actions.doubleClick(target).perform();
	}
}