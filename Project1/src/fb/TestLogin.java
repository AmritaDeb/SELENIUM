package fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("amritadebbarman@gmail.com");
		Thread.sleep(1000);
		lp.setPassword("123");
		lp.clickLogin();
	}

}
