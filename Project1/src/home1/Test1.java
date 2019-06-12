package home1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		//get() => enter the URL
		driver.get("http://google.com");
		
		//manage() => manage window size
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//getTitle() => get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//getCurrentUrl() => get the current URL
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//getPageSource() => get the html page source
		String src = driver.getPageSource();
		System.out.println(src);
		
		//navigate() => enter the URL [call the get()]
		driver.navigate().to("http://facebook.com");
		Thread.sleep(2000);
		
		//back to the previous url
		driver.navigate().back();
		Thread.sleep(2000);
		
		//forward to the next URL
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//refresh the page
		driver.navigate().refresh();
		
		//close the current the window
		driver.close();
	}
}
