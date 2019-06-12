
//Write a program to display client version of ruby present in selenium page

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("https://www.seleniumhq.org/download/");
		//Find element of client version of ruby
	WebElement v = driver.findElement(By.xpath("//td[.='Ruby']/../td[2]"));
	String version = v.getText();
	System.out.println(version);
		//Close the browser
	driver.close();
	}
}
