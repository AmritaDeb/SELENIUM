
/* To get the tagname of a field*/

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("https://demo.actitime.com/login.do");
		//find the view-licence element
	WebElement link = driver.findElement(By.id("toPasswordRecoveryPageLink"));
		//get the tag name
	String tagName = link.getTagName();
	
	Thread.sleep(2000);
		//Compare the actual result with expected result
	if(tagName.equals("a")){
		System.out.println("Pass.. ");
	}
	else{
		System.out.println("Fail.. ");	
	}
		//Close the browser
	driver.close();
	}
}


