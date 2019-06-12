
//Write a program to click the next button on actiTIME.com and print the hexcolor, font-size, font-family, font-style
//and write the testcase pass or fail

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Test16 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("http://localhost/login.jsp");
		//
	driver.findElement(By.id("loginButton")).click();
	
	String xp = "//span[contains(text(),'invalid')]";
	WebElement msg = driver.findElement(By.xpath(xp));
	
	String eMsg = msg.getTagName();
	System.out.println(eMsg);
	
	String rgbColor = msg.getCssValue("color");
	System.out.println(rgbColor);
	
	String hexColor = Color.fromString(rgbColor).asHex();
	System.out.println(hexColor);
	
	if(hexColor.equals("#ce0100")){
		System.out.println("Pass..");
	}
	else{
		System.out.println("Fail..");
	}
		//Close the browser
	driver.close();
	}
}
