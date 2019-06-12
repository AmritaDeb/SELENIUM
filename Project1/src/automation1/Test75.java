/*
 	go to trivago.in & type bang
	select bangalore international airport
 	select check-in, check-out & room
*/

package automation1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test75 {
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
		Thread.sleep(3000);
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String check_in = formatter.format(date);
		System.out.println(check_in);
		
		driver.findElement(By.xpath("//span[.='Check-in']")).click();
		//driver.findElement(By.xpath("//time[@datetime='"+ check_in +"']")).click();
		driver.findElement(By.xpath("//time[@datetime='2018-10-5']")).click();
		
		driver.findElement(By.xpath("//span[.='Check-out']")).click();
		driver.findElement(By.xpath("//time[@datetime='2018-10-10']")).click();
		
		driver.findElement(By.xpath("//div[@key='roomsButton']")).click();
		
		driver.close();
	}
}