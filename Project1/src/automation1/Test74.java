/*
 	go to trivago.in & type bang
	select bangalore international airport
 	print the name & price of all the hotel
*/

package automation1;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.Soundbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test74 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.trivago.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("horus-querytext")).sendKeys("bangalore");
		String xp = "//span[contains(text(),'International Airport')]";
		driver.findElement(By.xpath(xp)).click();
		Thread.sleep(5000);
		
		List<WebElement> allName = driver.findElements(By.xpath("//h3[@title]"));
		System.out.println(allName.size());
		System.out.println("~~~~~~~~~~~~~~");
		
		List<WebElement> allPrice = driver.findElements(By.cssSelector(".item__best-price"));
		System.out.println(allPrice.size());
		System.out.println("~~~~~~~~~~~~~~");
		
		for(int i=0; i<allName.size(); i++)
		{
			String name = allName.get(i).getText();
			String price = allPrice.get(i).getText();
			System.out.println(name + "-->" + price);
		}
		
		driver.close();
	}
}