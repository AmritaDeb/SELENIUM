package home1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://naukri.com");
		driver.manage().window().maximize(); 
		Thread.sleep(2000);
		
		Set<String> allWHS = driver.getWindowHandles();
		for(String wh:allWHS)
		{
			System.out.println(wh);
			driver.switchTo().window(wh).close();
			//driver.switchTo().window(wh); //if we comment switchTo(), it will not switch to any other browser
			//String title=driver.getTitle();
			//System.out.println(title);
			//driver.close();        // if switchTo() is not used 
			//driver.close();        // close all the windows one by one according to loop
		}
		  
		//driver.close();    // close the last window 
		//driver.quit(); 

	}
}
