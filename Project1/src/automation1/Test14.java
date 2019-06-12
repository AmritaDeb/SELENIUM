
//Write a program to click the next button on gmail.com & print the error message

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("https://www.gmail.com");
		//
	driver.findElement(By.xpath("//span[.='Next']")).click();
	
	String xp = "//div[contains(text(),'Enter an')]";
	String msg = driver.findElement(By.xpath(xp)).getText();
	System.out.println(msg);
	
		//Close the browser
	driver.close();
	}
}
