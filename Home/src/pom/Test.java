package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("admin");
		lp.setPassword("manager");
		lp.clickLogin();
		
		HomePage hp = new HomePage(driver);
		hp.clickUserLink();
		
		UserListPage up = new UserListPage(driver);
		up.clickAddUserLink();
		up.setFirstName("abc");
		Thread.sleep(2000);
		up.clickCloseLink();
		
		System.out.println(up.alertMsg());
		up.clickOkOnAlert();
		Thread.sleep(2000);
		driver.close();
	}
}
