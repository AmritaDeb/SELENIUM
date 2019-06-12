
//Write a program to display the price of headphone & speakers from flipkart

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("https://www.flipkart.com/");
		//
	WebElement v = driver.findElement(By.xpath("//div[.='Headphones&Speakers']/../div[3]"));
	System.out.println(v);
	String price = v.getText();
	System.out.println(price);
		//Close the browser
	driver.close();
	}
}
