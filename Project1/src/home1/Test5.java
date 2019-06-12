package home1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		//get() => enter the URL
		driver.get("http://google.com");
		
		//maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//resize the window
		Dimension d = new Dimension(800,400);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		//minimize the window
		driver.manage().window().setPosition(new Point(0, -1000));
		Thread.sleep(2000);
		
		//close the current the window
		driver.close();
	}
}
