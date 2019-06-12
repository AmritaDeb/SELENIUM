
/*
 	Go to facebook, find the height and width of the username and password textfields,
 	compare the size to check the height and width same or not
 	
 */

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("https://facebook.com");
	
	WebElement un = driver.findElement(By.id("email"));
	int h1 = un.getSize().getHeight();
	int w1 = un.getSize().getWidth();
	System.out.println(h1 + " " + w1);
	
	WebElement pass = driver.findElement(By.id("pass"));
	int h2 =pass.getSize().getHeight();
	int w2 = pass.getSize().getWidth();
	System.out.println(h2 + " " + w2);
	
	Thread.sleep(2000);
	
	if(h1 == h2 && w1 == w2)
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail..");
	}	
		//Close the browser
	driver.close();
	}
}
