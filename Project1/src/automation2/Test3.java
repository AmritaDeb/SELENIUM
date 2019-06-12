
/*
 * Qs. Go to flipkart, close the hidden division popup using POM class
 * */

package automation2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test3 {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Demo3Page lp = new Demo3Page(driver);
		lp.clickClose();
		
		//driver.close();
	}

}
