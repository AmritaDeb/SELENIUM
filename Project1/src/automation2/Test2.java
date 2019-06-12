
/*
 * Qs. Write a script to count no of images of flipkart using POM class
 * */

package automation2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test2 {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Demo2Page lp = new Demo2Page(driver);
		
		System.out.println("The total link:" + lp.getLinkCount());
		
		driver.close();
	}

}
