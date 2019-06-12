
/*
 	Go to actiTIME, find the x-axes location of username and password textfield,
 	compare the x-axes location to check the allignment of the textfields.
 	
 */

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("https://demo.actitime.com/login.do");
	
		//Find element of username field
	WebElement un = driver.findElement(By.id("username"));
	int x1 = un.getLocation().getX();
	System.out.println(x1);
	
	boolean condition1 = un.isDisplayed();
	
		//find element of password field
	WebElement pw = driver.findElement(By.name("pwd"));
	int x2 = pw.getLocation().getX();
	System.out.println(x2);
	
	boolean condition2 = pw.isDisplayed();
	
	Thread.sleep(2000);
	
	boolean condition3 = (x1 == x2);
	
	if(condition1 && condition2 && condition3)
	{
		System.out.println("Pass..");
	}
	else
	{
		System.out.println("Fail..");
	}
	
		//Close the browser
	driver.close();
	}
}
