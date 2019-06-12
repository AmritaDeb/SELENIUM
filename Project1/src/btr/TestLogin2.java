package btr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin2 {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("aaaa");
		lp.setPassword("mmmm");
		lp.clickLogin();			//after click page will refresh
		
		Thread.sleep(2000);
		
		LoginPage lp1 = lp;
		lp1.setUserName("admin");
		lp1.setPassword("manager");
		lp1.clickLogin();
	}

}
