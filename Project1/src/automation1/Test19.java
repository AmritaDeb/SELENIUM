//Goto the url 

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test19 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("https://www.plus2net.com/javascript_tutorial/enable-disable-demo.php");
	
	WebElement tbx = driver.findElement(By.name("other_text"));
	
		// enter abcd on the textfield
			tbx.sendKeys("abcd");
			// wait for 2 mins
			Thread.sleep(2000);
			// clear the textfield
			tbx.clear();
	
	
		//Close the browser
	driver.close();
	}
}
