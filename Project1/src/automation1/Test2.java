
/*
 	Go to actiTIME, check the login page is displayed or not by the 'Title' condition
 */

package automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("http://localhost/login.do");
		//Expected Result
	String expectedTitle = "actiTIME - Login";
	System.out.println(expectedTitle);
		//Actual Result
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
		//Compare the actual result with expected result
	if(actualTitle.equals(expectedTitle)){
		System.out.println("Pass: ActiTIME login page is displayed");
	}
	else{
		System.out.println("Fail: ActiTIME login page is not displayed");	
	}
		//Close the browser
	driver.close();
	}
}
