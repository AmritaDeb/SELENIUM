
/*
  	Go to facebook.com, select day=31, month=12, yr=1993
*/

package listing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		
		String day_xp = "//select[@id='day']/option[@value='31']";
		WebElement day = driver.findElement(By.xpath(day_xp));
		day.click();
		System.out.println(day.getText());
		
		String mon_xp = "//select[@id='month']/option[@value='12']";
		WebElement mon = driver.findElement(By.xpath(mon_xp));
		mon.click();
		System.out.println(mon.getText());
		
		String yr_xp = "//select[@id='year']/option[@value='1993']";
		WebElement yr = driver.findElement(By.xpath(yr_xp));
		yr.click();
		System.out.println(yr.getText());
		
		driver.close();
	}

}