/*
 	Hidden division popup for starhealth  	
*/

package automation1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test48 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://retail.starhealth.in/renewal");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("nqame2")).sendKeys("policy123");
		driver.findElement(By.id("dtDOB")).click();
		
		driver.findElement(By.linkText("15")).click();
		
		driver.findElement(By.id("proceed")).click();
	
	}
}