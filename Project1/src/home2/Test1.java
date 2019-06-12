

package home2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Test1{
	static{
			//Set the path of chrome driver
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			//set the path of mozilla driver
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args){
			//Open the chrome browser
		WebDriver driver = new ChromeDriver();
			//Enter the URL
		driver.get("https://www.gmail.com");
			//Find the element of next button
		driver.findElement(By.xpath("//span[.='Next']")).click();
			//Find the text element of error messege
		 WebElement eMsg = driver.findElement(By.xpath("//div[.='Enter an email or phone number']"));
			//Get the error messege & print it
		String msg = eMsg.getText();
		System.out.println(msg);
			//Get the tag name & print it
		String tag = eMsg.getTagName();
		System.out.println(tag);
			//Get the tag name & print it
		String rgbcolor = eMsg.getCssValue("color");
		System.out.println(rgbcolor);
			//Get the tag name & print it
		String hexcolor = Color.fromString(rgbcolor).asHex();
		System.out.println(hexcolor);
		
		
		
		
		
		
		
		
			//Close the window
		driver.close();
		
	}
}