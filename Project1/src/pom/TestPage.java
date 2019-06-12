package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPage {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage lp = new LoginPage(driver);
		
			//login
		lp.setUserName("admin");
		lp.setPassword("manager");
		lp.clickLogin();
		Thread.sleep(2000);
		
			//click on user link
		HomePage hp = new HomePage(driver);
		hp.clickUser();
		Thread.sleep(2000);
		
			//click on add user link & enter the first name & click on close
		UserPage user = new UserPage(driver);
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
