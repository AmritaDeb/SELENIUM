
/*
 * Qs. Go to actitime.com, take screenshot of the login page,
 *     store in the 'photo' folder in unique name, so that no new file can replace previous one
*/

package qsp;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoI {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws IOException {
		
	Date d1 = new Date();
	String s = d1.toString();
	System.out.println(s);
	String v = s.replaceAll(":", "-");
	System.out.println(v);
	
	WebDriver driver = new ChromeDriver();        //open chrome browser
	driver.get("http://localhost/login.do");
	
	TakesScreenshot t = (TakesScreenshot) driver;  //type casting
	//take the screenshot
	
	File srcFile = t.getScreenshotAs(OutputType.FILE);
	//create new file portable graphics
	File destFile = new File("./photo/login_"+v+".png");
	//copy paste the screenshot to new file
	FileUtils.copyFile(srcFile, destFile);
	
	driver.close();
	}
}
