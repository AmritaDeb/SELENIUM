
/* Qs. Open the browser, enter the URL of naukri.com, 
 * 	   take a window name as a user input,
 * 	   print the window handle of each window along with their title,
 * 	   close the window which title is taken by user
*/

package qsp;

import java.util.Set;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoG {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();        //open chrome browser
	driver.get("http://www.naukri.com");         //Enter naukri.com
	driver.manage().window().maximize();        //maximize the browser
	
	Set<String> allWHS = driver.getWindowHandles();        //get window handles of all the browser and print the address
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the window name:");
	String s1 = s.next();
		
	for(String wh:allWHS)
	{
		System.out.println(wh);
		driver.switchTo().window(wh);
		String t = driver.getTitle();
		System.out.println(t);
		if(t.equals(s1))
		{
		driver.close();        //close the user input browser
		}
	}
}
}
