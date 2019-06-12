/*
 	Print the title of home page of actitime  	
*/

package automation1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test42 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL and wait till page is loaded
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.titleContains("Time-Track"));
	
	String title1 = driver.getTitle();
	System.out.println(title1);
	
	driver.findElement(By.id("logoutLink")).click();
	
	wait.until(ExpectedConditions.titleContains("Login"));
	
	String title2 = driver.getTitle();
	System.out.println(title2);
	
	
	driver.close();
	
	
	}
}