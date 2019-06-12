package home1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		//WebElement e = driver.switchTo().activeElement();
		WebElement e1 = driver.findElement(By.name("username"));
		Thread.sleep(2000);
		
		e1.sendKeys("sid");
		Thread.sleep(2000);
		
		WebElement e2 = driver.findElement(By.name("pwd"));
		
		e2.sendKeys("123");
		Thread.sleep(2000);
		
		e1.clear();
		Thread.sleep(2000);
		e2.clear();
		Thread.sleep(2000);
		
		driver.close();
	}
}
