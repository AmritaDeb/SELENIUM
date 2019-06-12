/*
 	cancel print popup in chrome
*/

package automation1;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test63 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		Robot r = new Robot();
	
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		
		String parent = driver.getWindowHandle();
		
		//switch to print popup
		
		for(String wh:driver.getWindowHandles()){
			driver.switchTo().window(wh);
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Cancel'])[1]")).click();
		
		driver.switchTo().window(parent);
		
		driver.close();
		
	}
}