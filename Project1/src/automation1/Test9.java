
//Print the background text present in the textfields.

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("https://demo.actitime.com/login.do");
		//find the username element
	WebElement un = driver.findElement(By.id("username"));
		//get the attribute of placeholder
	String un_placeholder = un.getAttribute("placeholder");
		//print the place holder
	System.out.println(un_placeholder);
	
		//find the username element
	WebElement pass = driver.findElement(By.name("pwd"));
		//get the attribute of placeholder
	String pass_placeholder = pass.getAttribute("placeholder");
		//print the place holder
	System.out.println(pass_placeholder);
	
	Thread.sleep(2000);
		
		//Close the browser
	driver.close();
	}
}


