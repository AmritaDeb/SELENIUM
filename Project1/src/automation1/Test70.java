/*
 	get all the auto suggestions in google.com,
 	type java in the search box, count the no. of auto suggestion,
 	print all the auto suggestion, select the first auto suggestion	
*/

package automation1;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test70 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		
		String xp = "//div[contains(text(),'java')]";
		List<WebElement> allResult = driver.findElements(By.xpath(xp));
		
		int count = allResult.size();
		System.out.println(count);
		System.out.println("----------------------");
		/*
		for(int i=0; i<count; i++)
		{
			WebElement link = allResult.get(i);
			String text = link.getText();
			if(text.length()>0)
			{
				System.out.println(text);
			}
		}*/
		for(WebElement link:allResult)
		{
			String text = link.getText();
			if(text.length()>0)
			{
				System.out.println(text);
			}
		}
		allResult.get(0).click();
		System.out.println("----------------------");
		driver.close();
		
	}
}