/*
 	Go to www.facebook.com, check the login page is displayed or not by the 'Title' condition
 */

package automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
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
	String expectedTitle = "Facebook – log in or sign up";
	System.out.println(expectedTitle);
		//Actual Result
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
		//Compare the actual result with expected result
	if(actualTitle.equals(expectedTitle)){
		System.out.println("Pass: Facebook login page is displayed");
	}
	else{
		System.out.println("Fail: Facebook login page is not displayed");	
	}
		//Close the browser
	driver.close();
	}
}
