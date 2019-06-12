/*
 	
*/

package automation1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test44 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL and wait till page is loaded
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	
	while(true){
		try{
			driver.findElement(By.id("logoutLink")).click();
			System.out.println("Clicked logout link");
			break;
		}catch(Exception e){
			System.out.println("No logout link");
		}	
	}
	System.out.println("End");
	driver.close();
	}
}