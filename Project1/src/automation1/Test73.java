/*
 	go to trivago.in & type bang
	select bangalore international airport
 	print the name of the 1st hotel
*/

package automation1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test73 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.trivago.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("horus-querytext")).sendKeys("bengaluru");
		String xp = "//span[contains(text(),'International Airport')]";
		driver.findElement(By.xpath(xp)).click();
		
		//String name = driver.findElement(By.xpath("(//h3[@title])[1]")).getText();
		
		List<WebElement> allName = driver.findElements(By.xpath("//h3[@title]"));
		String name = allName.get(0).getText();
		
		System.out.println(name);
		Thread.sleep(2000);
		
		//driver.close();
	}
}