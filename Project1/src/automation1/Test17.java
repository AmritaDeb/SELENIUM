
//Write a program to click the next button on gmail.com and print the hexcolor, font-size, font-family, font-style
//and write the testcase pass or fail

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Test17 {
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
	WebElement msg = driver.findElement(By.xpath(xp));
	
	String tag = msg.getTagName();
	System.out.println(tag);
	
	String err_msg = msg.getText();
	System.out.println(err_msg);
	
	String rgbColor = msg.getCssValue("color");
	System.out.println(rgbColor);
	
	String hexColor = Color.fromString(rgbColor).asHex();
	System.out.println(hexColor);
	boolean condition1 = hexColor.equals("#d50000");
	
	String font_size = msg.getCssValue("font-size");
	System.out.println(font_size);
	boolean condition2 = font_size.equals("12px");
	
	String font_family = msg.getCssValue("font-family");
	System.out.println(font_family);
	//boolean condition3 = font_family.equals("Roboto, RobotoDraft, Helvetica, Arial, sans-serif");
	boolean condition3 = font_family.contains("Arial");
	
	String font_style = msg.getCssValue("font-style");
	System.out.println(font_style);
	boolean condition4 = font_style.equals("normal");
	
	if(condition1 && condition2 && condition3 && condition4){
		System.out.println("Pass..");
	}
	else{
		System.out.println("Fail..");
	}
		//Close the browser
	driver.close();
	}
}
