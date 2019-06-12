/*
 * Write a code to scroll a webpage
 * */

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test23 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	//driver.get("http://localhost/login.do");
	driver.get("https://www.actitime.com/license-agreement");
	
	//driver.findElement(By.id("licenseLink")).click();
		//(type-casting)
	JavascriptExecutor j = (JavascriptExecutor) driver;
	
	int y = 500;
		//Scroll Down
	/*
	for(int i=1;i<=5;i++){
		j.executeScript("window.scrollBy(0," + y + ")");
		Thread.sleep(2000);
	}
	for(int i=1;i<=5;i++){
		j.executeScript("window.scrollBy(0,-" + y + ")");
		Thread.sleep(2000);
	}
	*/
	for(int i=1;i<=5;i++){
		j.executeScript("window.scrollTo(0," + y + ")");
		Thread.sleep(2000);
	}
	for(int i=1;i<=5;i++){
		j.executeScript("window.scrollTo(0,-" + y + ")");
		Thread.sleep(2000);
	}
	
	Thread.sleep(2000);
		//Close the browser
	driver.close();
	}
}
