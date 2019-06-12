/*
  	Go to facebook.com, select day=31, month=12, yr=1993
*/

package automation1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test82 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']/option[@value='31']"));
		System.out.println(day.getText());
		day.click();
		Thread.sleep(5000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']/option[@value='12']"));
		System.out.println(month.getText());
		month.click();
		Thread.sleep(5000);
		
		WebElement yr = driver.findElement(By.xpath("//select[@id='year']/option[@value='1993']"));
		System.out.println(yr.getText());
		yr.click();
		Thread.sleep(5000);
		
		driver.close();
	}
}