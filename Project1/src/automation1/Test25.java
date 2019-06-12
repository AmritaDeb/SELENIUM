//To clear the value from the textfield

package automation1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test25 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("file:///D:/QSpiders/SELENIUM/html/JSDemo.html");
		//(type-casting)
	JavascriptExecutor j = (JavascriptExecutor) driver;
	Thread.sleep(2000);
		//execute the javascript
	j.executeScript("document.getElementById('t1').value=' '");
	
	Thread.sleep(2000);
	
		//Close the browser
	driver.close();
	}
}
