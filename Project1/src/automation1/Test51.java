/*
 	write a script to change depart in makemytrip.com 	
*/

package automation1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test51 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("hp-widget__depart")).click();
		driver.findElement(By.linkText("31")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		
	}
}