package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPage1 {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage1 lp = new LoginPage1(driver);
		
			//login
		lp.setUserName("admin");
		lp.setPassword("manager");
		Thread.sleep(2000);
		
			//click on user link
		HomePage1 hp = lp.clickLogin();
		Thread.sleep(2000);
		
		UserPage1 user = hp.clickUser();
		user.clickAddUser();
		Thread.sleep(2000);
		
		user.setFName("abc");
		user.clickClose();
		Thread.sleep(2000);
			//switch to javascript popup & Print the msg & click ok
		System.out.println(user.alertMsg());
		user.clickOkOnAlert();
		Thread.sleep(2000);
		driver.close();

		
	}

}
