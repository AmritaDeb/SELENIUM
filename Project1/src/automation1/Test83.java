/*
  	Go to hotel.html, print all the listbox contents
*/

package automation1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test83 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/QSpiders/SELENIUM/html/hotel.html");
		driver.manage().window().maximize();
		
		String xp = "//select[@id='mtr']/option";
		List<WebElement> all = driver.findElements(By.xpath(xp));

		 int count = all.size();
		 System.out.println(count);
		 System.out.println("-----------------");
		
		for(WebElement list:all)
		{
			System.out.println(list.getText());
			list.click();
			Thread.sleep(2000);
		}
		driver.close();
	}
}