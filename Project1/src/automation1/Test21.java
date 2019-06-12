//Goto the url , enter the username & password , click on sign in by using javascriptExecuter

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test21 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("https://demo.vtiger.com/index.php");
		//(type-casting)
	JavascriptExecutor j = (JavascriptExecutor) driver;
		//execute the javascript for username and password
	j.executeScript("document.getElementById('username').value='admin'");
	j.executeScript("document.getElementById('password').value='admin'");
	
	Thread.sleep(2000);
		//to click the login button
	//driver.findElement(By.xpath("//button[.='Sign in']")).click();
	//driver.findElement(By.xpath("//button[.='Sign in']")).submit();
	driver.findElement(By.xpath("//button[.='Sign in']")).sendKeys(Keys.ENTER);
	
		//Close the browser
	driver.close();
	}
}
