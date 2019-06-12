
/* Qs. Open the browser, enter the URL of naukri.com, 
 * 	   print the window handle of current window, print the window handles of all the windows,
 * 	   close all the window
*/

package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoE {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args){
		
	WebDriver driver = new ChromeDriver();        //open chrome browser
	driver.get("http://www.naukri.com");         //Enter naukri.com
	driver.manage().window().maximize();        //maximize the browser
	
	String v= driver.getWindowHandle();			//get window handle of current browser and print the address
	System.out.println(v);
	
	Set<String> s = driver.getWindowHandles();        //get window handles of all the browser and print the address
	System.out.println(s);
	
	driver.quit();        //close all the browser
	
	}
}
