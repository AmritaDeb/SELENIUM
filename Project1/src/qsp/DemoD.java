
/*
 * Qs. Open the browser, enter the URL of naukri.com, close all the window,
 *     again open the browser, enter the URL of naukri.com, close only current window
*/

package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoD {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();        //open chrome browser
	driver.get("http://www.naukri.com");         //Enter naukri.com
	driver.manage().window().maximize();        //maximize the browser
	driver.quit();        //close all the browser
	Thread.sleep(2000);			//wait for 2sec
	
	driver=new ChromeDriver();			//Again open the browser
	driver.get("http://www.naukri.com");
	driver.close();           //close only the current browser
	}
}
