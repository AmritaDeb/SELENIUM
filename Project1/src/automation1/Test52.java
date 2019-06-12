/*
 	write a script to change depart in yatra.com 	
*/

package automation1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test52 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		
		driver.findElement(By.id("BE_flight_origin_date")).click();
		driver.findElement(By.id("30/09/2018")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		
	}
}