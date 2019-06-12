
/*
 * Qs. Go to actitime.com, take screenshot of the login page,
 *     store in the 'photo' folder 
*/

package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoH {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws IOException {
		
	WebDriver driver = new ChromeDriver();        //open chrome browser
	driver.get("http://localhost/login.do");
	
	TakesScreenshot t = (TakesScreenshot) driver;  //type casting
	
	File srcFile = t.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./photo/login.png");
	FileUtils.copyFile(srcFile, destFile);
	driver.close();
	}
}
