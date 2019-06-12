
// Q. Get the title, url and html code of actitime, then enter the facebook URL

package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoB {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	public static void test(WebDriver driver){
		
		//Enter the URL in address bar & wait till the page is loaded
		driver.get("http://localhost/login.do");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//get the title of the page & print it
		String title = driver.getTitle();
		System.out.println(title);
		
		//get the url of the page & print it
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//get HTML code of the page & print it
		String html=driver.getPageSource();
		System.out.println(html);
		
		//Enter the URL
		driver.navigate().to("http:/facebook.com");
		
		//close the browser
		driver.close();
	}

	public static void main(String[] args) {
		//open chrome browser
	WebDriver driver = new ChromeDriver();
	test(driver);
	
	}
}
