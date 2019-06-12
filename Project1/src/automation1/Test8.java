//check the actiTIME present below the logo is image or not

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("https://demo.actitime.com/login.do");
		//find the view-licence element
	WebElement logo_text = driver.findElement(By.xpath("//img[contains(@src,'logo.png')]"));
		//get the tag name
	String tagName = logo_text.getTagName();
	System.out.println(tagName);
		//Compare the actual result with expected result
	if(tagName.equals("img")){
		System.out.println("Pass.. ");
	}
	else{
		System.out.println("Fail.. ");	
	}
		//Close the browser
	driver.close();
	}
}


