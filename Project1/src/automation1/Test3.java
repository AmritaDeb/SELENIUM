
/*
 	Go to www.facebook.com, check the login page is displayed or not 
 	by the 'Title' condition, user_id, password, login button conditions
 */

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("https://www.facebook.com");
		//Expected Result
	String expectedTitle = "log in";
	System.out.println(expectedTitle);
		//Actual Result
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
	
	boolean condition1 = actualTitle.contains(expectedTitle);
	
	WebElement un = driver.findElement(By.id("email"));
	WebElement pass = driver.findElement(By.id("pass"));
	WebElement login_bttn = driver.findElement(By.xpath("//input[@value='Log In']"));
	
	boolean condition2 = un.isDisplayed() && pass.isDisplayed() && login_bttn.isDisplayed();
	
		//Compare the actual result with expected result
	if(condition1 && condition2 ){
		System.out.println("Pass: Facebook login page is displayed");
	}
	else{
		System.out.println("Fail: Facebook login page is not displayed");	
	}	
		//Close the browser
	driver.close();
	}
}
