/*
 	Javascript popup for actitime  	
*/

package automation1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test49 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		driver.findElement(By.xpath("//div[.='USERS']")).click();
		driver.findElement(By.xpath("//div[.='Add User']")).click();
	
		driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.id("closeUserDataLightBoxBtn")).click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		
		alert.accept();   
		
		//alert.dismiss();
		
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
	
	}
}