
/*
 * Qs. Write a script to count no of images of google using POM class
 * */

package automation2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		Demo1Page lp = new Demo1Page(driver);
		
		System.out.println("The total link:" + lp.getLinkCount());
		
		driver.close();
	}

}
