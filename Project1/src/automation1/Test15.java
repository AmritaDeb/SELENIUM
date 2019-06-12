
//Write a program to click the next buuton on gmail.com

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Test15 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("https://demo.actitime.com/login.do");
		//
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Thread.sleep(2000);
	
	String xp = "//span[contains(text(),'invalid')]";
	WebElement msg = driver.findElement(By.xpath(xp));
	System.out.println(msg);
	
	String rgbColor = msg.getCssValue("color");
	System.out.println(rgbColor);
	
	String hexColor = Color.fromString(rgbColor).asHex();
	System.out.println(hexColor);
	
		//Close the browser
	driver.close();
	}
}
