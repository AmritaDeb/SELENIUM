package btm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestLogin4 {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage3 lp = new LoginPage3(driver);
		
		lp.setUserName("admin");
		lp.setPassword("manager");
		lp.clickLogin();
		
		driver.close();
	}

}
